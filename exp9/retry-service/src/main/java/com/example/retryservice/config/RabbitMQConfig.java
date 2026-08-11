package com.example.retryservice.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String MAIN_QUEUE = "order.retry.queue";
    public static final String DLQ = "order.deadletter.queue";

    public static final String EXCHANGE = "order.retry.exchange";
    public static final String DLX = "order.deadletter.exchange";

    public static final String ROUTING_KEY = "order.created";
    public static final String DLQ_ROUTING_KEY = "order.failed";

    // RabbitMQ Admin - automatically declares exchanges, queues and bindings
    @Bean
    public AmqpAdmin amqpAdmin(ConnectionFactory connectionFactory) {
        return new RabbitAdmin(connectionFactory);
    }

    // Main exchange
    @Bean
    public DirectExchange retryExchange() {
        return new DirectExchange(EXCHANGE, true, false);
    }

    // Dead-letter exchange
    @Bean
    public DirectExchange deadLetterExchange() {
        return new DirectExchange(DLX, true, false);
    }

    // Main queue with Dead-Letter Exchange configuration
    @Bean
    public Queue retryQueue() {
        return QueueBuilder
                .durable(MAIN_QUEUE)
                .deadLetterExchange(DLX)
                .deadLetterRoutingKey(DLQ_ROUTING_KEY)
                .build();
    }

    // Dead-letter queue
    @Bean
    public Queue deadLetterQueue() {
        return QueueBuilder
                .durable(DLQ)
                .build();
    }

    // Main exchange → Main queue
    @Bean
    public Binding retryBinding() {
        return BindingBuilder
                .bind(retryQueue())
                .to(retryExchange())
                .with(ROUTING_KEY);
    }

    // Dead-letter exchange → Dead-letter queue
    @Bean
    public Binding deadLetterBinding() {
        return BindingBuilder
                .bind(deadLetterQueue())
                .to(deadLetterExchange())
                .with(DLQ_ROUTING_KEY);
    }
}
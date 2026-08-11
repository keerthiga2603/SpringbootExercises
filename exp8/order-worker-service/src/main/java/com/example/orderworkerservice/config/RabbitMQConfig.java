@Configuration
public class RabbitMQConfig {

    public static final String EXCHANGE = "event.exchange";
    public static final String QUEUE = "event.queue";
    public static final String DLQ = "event.dlq";
    public static final String DLX = "event.dlx";

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange(EXCHANGE);
    }

    @Bean
    public DirectExchange deadLetterExchange() {
        return new DirectExchange(DLX);
    }

    @Bean
    public Queue eventQueue() {
        return QueueBuilder.durable(QUEUE)
                .deadLetterExchange(DLX)
                .deadLetterRoutingKey("event.dlq")
                .build();
    }

    @Bean
    public Queue deadLetterQueue() {
        return QueueBuilder.durable(DLQ).build();
    }

    @Bean
    public Binding eventBinding() {
        return BindingBuilder.bind(eventQueue())
                .to(exchange())
                .with("event");
    }

    @Bean
    public Binding deadLetterBinding() {
        return BindingBuilder.bind(deadLetterQueue())
                .to(deadLetterExchange())
                .with("event.dlq");
    }
}
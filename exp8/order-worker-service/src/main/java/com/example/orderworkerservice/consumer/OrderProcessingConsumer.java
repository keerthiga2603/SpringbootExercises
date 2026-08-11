package com.example.orderworkerservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.orderworkerservice.event.OrderCreatedEvent;

@Component
public class OrderProcessingConsumer {

    @RabbitListener(queues = "order.processing.queue")
    public void processOrder(OrderCreatedEvent event) {

        System.out.println("===== Processing Order =====");
        System.out.println("Order ID: " + event.getOrderId());
        System.out.println("Product: " + event.getProduct());
        System.out.println("Quantity: " + event.getQuantity());

        // Intentionally fail the order
        if ("FAIL".equalsIgnoreCase(event.getProduct())) {
            System.out.println("❌ Order processing failed!");
            throw new RuntimeException("Order processing failed");
        }

        System.out.println("✅ Order processed successfully");
        System.out.println("============================");
    }
}
package com.example.saga.listener;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.saga.event.*;


@Component
public class DeliveryEventListener {


    private final ApplicationEventPublisher publisher;


    public DeliveryEventListener(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }


    @EventListener
    public void handlePayment(PaymentCompletedEvent event) {


        System.out.println("Payment Completed");
        System.out.println("Creating Delivery");


        DeliveryCreatedEvent deliveryEvent =
                new DeliveryCreatedEvent(
                        event.getOrderId()
                );


        publisher.publishEvent(deliveryEvent);
    }


    @EventListener
    public void handleDelivery(DeliveryCreatedEvent event) {

        System.out.println("Delivery Created");
        System.out.println("Saga Completed Successfully");
        System.out.println("Order ID : " + event.getOrderId());
    }
}
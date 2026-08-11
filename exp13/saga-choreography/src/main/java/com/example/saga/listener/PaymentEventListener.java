package com.example.saga.listener;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.saga.event.*;


@Component
public class PaymentEventListener {


    private final ApplicationEventPublisher publisher;


    public PaymentEventListener(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }


    @EventListener
    public void handleOrder(OrderPlacedEvent event) {


        System.out.println("Payment Processing Started");
        System.out.println("Order ID : " + event.getOrderId());


        PaymentCompletedEvent paymentEvent =
                new PaymentCompletedEvent(
                        event.getOrderId()
                );


        publisher.publishEvent(paymentEvent);
    }
}
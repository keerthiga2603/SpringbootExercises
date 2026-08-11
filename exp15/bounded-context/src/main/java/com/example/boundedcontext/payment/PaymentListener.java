package com.example.boundedcontext.payment;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.boundedcontext.order.OrderPlacedEvent;
import com.example.boundedcontext.event.PaymentCompletedEvent;


@Component
public class PaymentListener {


    private final ApplicationEventPublisher publisher;


    public PaymentListener(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }


    @EventListener
    public void processPayment(OrderPlacedEvent event) {


        System.out.println("Payment Domain");
        System.out.println("Processing payment for Order : "
                + event.getOrderId());


        PaymentCompletedEvent paymentEvent =
                new PaymentCompletedEvent(
                        event.getOrderId()
                );


        publisher.publishEvent(paymentEvent);
    }
}
package com.example.boundedcontext.delivery;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.boundedcontext.event.PaymentCompletedEvent;


@Component
public class DeliveryListener {


    @EventListener
    public void createDelivery(PaymentCompletedEvent event) {


        System.out.println("Delivery Domain");
        System.out.println(
                "Creating delivery for Order : "
                + event.getOrderId()
        );


        System.out.println("Delivery Created Successfully");
    }
}
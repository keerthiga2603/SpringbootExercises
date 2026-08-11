package com.example.paymentevent.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.paymentevent.event.PaymentCompletedEvent;

@Component
public class OrderStatusListener {


    @EventListener
    public void handlePayment(PaymentCompletedEvent event){

        System.out.println("Payment Received");
        System.out.println("Order ID : " + event.getOrderId());
        System.out.println("Payment ID : " + event.getPaymentId());

        System.out.println("Order Status Updated : PAID");
    }
}
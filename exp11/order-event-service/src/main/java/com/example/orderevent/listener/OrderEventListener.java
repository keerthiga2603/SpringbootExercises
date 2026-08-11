package com.example.orderevent.listener;

import com.example.orderevent.event.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderEventListener {

    @EventListener
    public void handleOrderPlaced(OrderPlacedEvent event) {

        System.out.println("Order Event Received");
        System.out.println("Order ID : " + event.getOrderId());
        System.out.println("Customer : " + event.getCustomerName());
        System.out.println("Amount : " + event.getAmount());
    }
}
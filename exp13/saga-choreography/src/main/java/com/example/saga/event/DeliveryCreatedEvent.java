package com.example.saga.event;

public class DeliveryCreatedEvent {

    private int orderId;

    public DeliveryCreatedEvent(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }
}
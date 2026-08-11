package com.example.saga.event;

public class OrderPlacedEvent {

    private int orderId;
    private String customer;

    public OrderPlacedEvent(int orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomer() {
        return customer;
    }
}
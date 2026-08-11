package com.example.orderevent.event;

public class OrderPlacedEvent {

    private int orderId;
    private String customerName;
    private double amount;

    public OrderPlacedEvent(int orderId, String customerName, double amount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}
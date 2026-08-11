package com.example.boundedcontext.order;

public class OrderPlacedEvent {

    private int orderId;
    private String product;

    public OrderPlacedEvent(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }
}
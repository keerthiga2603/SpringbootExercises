package com.example.boundedcontext.event;

public class PaymentCompletedEvent {

    private int orderId;


    public PaymentCompletedEvent(int orderId) {
        this.orderId = orderId;
    }


    public int getOrderId() {
        return orderId;
    }
}
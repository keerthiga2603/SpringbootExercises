package com.example.paymentevent.event;

public class PaymentCompletedEvent {

    private int orderId;
    private String paymentId;

    public PaymentCompletedEvent(int orderId, String paymentId) {
        this.orderId = orderId;
        this.paymentId = paymentId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }
}
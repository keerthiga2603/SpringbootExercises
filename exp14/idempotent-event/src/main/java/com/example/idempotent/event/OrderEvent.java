package com.example.idempotent.event;

public class OrderEvent {

    private String eventId;
    private int orderId;

    public OrderEvent(String eventId, int orderId) {
        this.eventId = eventId;
        this.orderId = orderId;
    }

    public String getEventId() {
        return eventId;
    }

    public int getOrderId() {
        return orderId;
    }
}
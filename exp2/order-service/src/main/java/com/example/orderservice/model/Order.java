package com.example.orderservice.model;

public class Order {

    private int id;
    private int customerId;
    private String dressName;
    private double amount;
    private String status;

    public Order() {
    }

    public Order(int id, int customerId, String dressName,
                 double amount, String status) {

        this.id = id;
        this.customerId = customerId;
        this.dressName = dressName;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getDressName() {
        return dressName;
    }

    public void setDressName(String dressName) {
        this.dressName = dressName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
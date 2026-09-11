package com.yogesh.lld.solidprinciples.srp.goodcode;

import java.util.List;
import java.util.Map;

public class Order {

    private String orderId;
    private List<String> items;
    private double totalAmount;
    private String customerEmail;

    public Order(String orderId, List<String> items, double totalAmount, String customerEmail) {
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
        this.customerEmail = customerEmail;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<String> getItems() {
        return items;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

}



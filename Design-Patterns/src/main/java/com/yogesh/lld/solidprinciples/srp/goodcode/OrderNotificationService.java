package com.yogesh.lld.solidprinciples.srp.goodcode;

import com.yogesh.lld.solidprinciples.srp.client.EmailClient;

public class OrderNotificationService {
    private final EmailClient emailClient; // interface, koi bhi provider inject ho sakta hai

    public OrderNotificationService(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    public void sendConfirmation(Order order, double totalAmount) {
        String subject = "Order Confirmation: " + order.getOrderId();
        String body = "Your order total is Rs." + totalAmount;
        emailClient.send(order.getCustomerEmail(), subject, body);
        System.out.println("Order Confirmation sent to " + order.getCustomerEmail());
    }
}

package com.yogesh.lld.solidprinciples.srp.badcode;

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

    //Responsibility 1: Business logic - calculate total
    public double calculateTotalAmount(Map<String, Double> priceMap) {
        double total = 0;
        for (String item : items) {
            total += priceMap.getOrDefault(item, 0.0);
        }
        return total;
    }

    //Responsibility 2: Persistence logic
    public void saveToDatabase() {
        System.out.println("saveToDatabase");
    }

    //Responsibility 3: Notification logic
    public void sendConfirmationEmail() {
        String subject = "Order Confirmation: " + orderId;
        String body = "Your order total is Rs. " + totalAmount;
        System.out.println("Sending confirmation email to " + customerEmail + " with subject " + subject);
    }

    // Responsibility 4: Printing/reporting logic
    public void printInvoice() {
        System.out.println("=== INVOICE ===");
    }


}

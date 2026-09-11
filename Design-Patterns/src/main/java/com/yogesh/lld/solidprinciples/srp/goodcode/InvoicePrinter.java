package com.yogesh.lld.solidprinciples.srp.goodcode;

public class InvoicePrinter {

    public void print(Order order, double totalAmount) {
        System.out.println("=== INVOICE ===");
        System.out.println("Order ID: " + order.getOrderId());
        for (String item : order.getItems()) {
            System.out.println("- " + item);
        }
        System.out.println("Total: Rs." + totalAmount);
    }
}

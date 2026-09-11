package com.yogesh.lld.basics.paymentapp;

public class Client {

    public static void main(String[] args) {

        PaymentService ps = new PaymentService();
        ps.addPayment("debit card", new DebitCard("d-123","yogesh"));
        ps.addPayment("credit card", new CreditCard("c-456","yogesh"));
        ps.addPayment("upi", new Upi("u-789","yogesh"));
        ps.addPayment("wallet", new Wallet("w-789","yogesh"));

        ps.makePayment("debit card");
        ps.makePayment("credit card");
        ps.makePayment("upi");
        ps.makePayment("wallet");

    }
}


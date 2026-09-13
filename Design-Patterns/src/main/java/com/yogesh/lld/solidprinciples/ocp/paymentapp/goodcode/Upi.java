package com.yogesh.lld.solidprinciples.ocp.paymentapp.goodcode;

public class Upi implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making payment via Upi: " + amount);
    }
}

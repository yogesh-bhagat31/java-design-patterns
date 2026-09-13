package com.yogesh.lld.solidprinciples.ocp.paymentapp.goodcode;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via CreditCard: " + amount);
    }
}

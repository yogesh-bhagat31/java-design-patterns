package com.yogesh.lld.solidprinciples.ocp.paymentapp.goodcode;

public class DebitCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Making payment via DebitCard: " + amount);
    }
}

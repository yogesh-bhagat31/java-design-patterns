package com.yogesh.lld.solidprinciples.ocp.paymentapp.goodcode;

public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.paymentProcess(new CreditCard(),100.00);
        paymentProcessor.paymentProcess(new DebitCard(),200.00);
        paymentProcessor.paymentProcess(new Paypal(),300.00);
        paymentProcessor.paymentProcess(new Upi(),400.00);


    }
}

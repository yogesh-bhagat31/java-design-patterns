package com.yogesh.lld.paymentapp;

public class Upi implements PaymentMethod {

    private String upiId;
    private String userName;

    public Upi(String upiId, String userName) {
        this.upiId = upiId;
        this.userName = userName;
    }

    @Override
    public void pay() {
        System.out.println("Upi payment successfull! of user :- " + userName + " " + upiId);
    }
}

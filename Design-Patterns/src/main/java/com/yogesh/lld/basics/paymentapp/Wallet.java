package com.yogesh.lld.basics.paymentapp;

public class Wallet implements PaymentMethod {

    private String walletId;
    private String userName;

    public Wallet(String walletId, String userName) {
        this.walletId = walletId;
        this.userName = userName;
    }

    @Override
    public void pay() {
        System.out.println("Wallet payment successfull! of user :- " + userName + " = " + walletId);
    }
}

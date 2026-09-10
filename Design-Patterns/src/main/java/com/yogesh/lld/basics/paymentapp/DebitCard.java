package com.yogesh.lld.paymentapp;

public class DebitCard extends Card {

    public DebitCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Debit card payment successfull! of user :-" + getUserName() + " = " + getCardNo());
    }
}

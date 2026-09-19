package com.yogesh.lld.solidprinciples.dip.notificationserviceapp.goodcode;

public class EmailService implements NotificationChannel {


    @Override
    public void send(String message) {
        System.out.println("Sending notification via mail");
    }
}

package com.yogesh.lld.solidprinciples.dip.notificationserviceapp.goodcode;

public class NotificationService {

    private final NotificationChannel notificationChannel;// Loose coupling

    NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendNotification(String message) {
        notificationChannel.send(message);
    }
}

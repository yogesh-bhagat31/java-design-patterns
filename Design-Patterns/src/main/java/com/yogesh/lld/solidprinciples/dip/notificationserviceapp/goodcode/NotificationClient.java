package com.yogesh.lld.solidprinciples.dip.notificationserviceapp.goodcode;

public class NotificationClient {

    public static void main(String[] args) {

        EmailService emailService = new EmailService();
        MsgService msgService = new MsgService();

        NotificationService mailService = new NotificationService(emailService);
        mailService.sendNotification("email");


        NotificationService notificationService = new NotificationService(msgService);
        notificationService.sendNotification("message");
    }
}

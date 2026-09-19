package com.yogesh.lld.solidprinciples.dip.notificationserviceapp.badcode;

public class NotificationService {

    private final EmailService emailService;// Tight coupling
    private final MsgService msgService;

    public NotificationService(EmailService emailService, MsgService msgService) {
        this.emailService = emailService;
        this.msgService = msgService;
    }

    public void notifyByEmail(String userName, String emailAddress) {
        emailService.sendEmail(userName, emailAddress);
    }

    public void notifyByMessage(String message) {
        msgService.sendMessage(message);
    }
}

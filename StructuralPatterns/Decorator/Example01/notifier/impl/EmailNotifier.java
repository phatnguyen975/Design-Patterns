package StructuralPatterns.Decorator.Example01.notifier.impl;

import StructuralPatterns.Decorator.Example01.notifier.Notifier;

public class EmailNotifier implements Notifier {

    private String adminEmail;

    public EmailNotifier(String email) {
        this.adminEmail = email;
    }

    @Override
    public void send(String message) {
        System.out.println("Sending email to " + adminEmail + ": " + message);
    }
}

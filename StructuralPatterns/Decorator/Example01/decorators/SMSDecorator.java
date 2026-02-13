package StructuralPatterns.Decorator.Example01.decorators;

import StructuralPatterns.Decorator.Example01.notifier.Notifier;

public class SMSDecorator extends BaseNotifierDecorator {

    public SMSDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        // Call the wrapped object's method first (or after)
        super.send(message);
        // Add extra behavior
        sendSMS(message);
    }

    private void sendSMS(String msg) {
        System.out.println("Sending SMS message: " + msg);
    }
}

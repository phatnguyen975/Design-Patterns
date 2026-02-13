package StructuralPatterns.Decorator.Example01.decorators;

import StructuralPatterns.Decorator.Example01.notifier.Notifier;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFB(message);
    }

    private void sendFB(String msg) {
        System.out.println("Sending Facebook message: " + msg);
    }
}

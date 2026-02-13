package StructuralPatterns.Decorator.Example01.decorators;

import StructuralPatterns.Decorator.Example01.notifier.Notifier;

public abstract class BaseNotifierDecorator implements Notifier {

    private Notifier wrappee;

    public BaseNotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }
}

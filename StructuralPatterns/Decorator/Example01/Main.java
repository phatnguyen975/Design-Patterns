package StructuralPatterns.Decorator.Example01;

import StructuralPatterns.Decorator.Example01.decorators.FacebookDecorator;
import StructuralPatterns.Decorator.Example01.decorators.SMSDecorator;
import StructuralPatterns.Decorator.Example01.notifier.Notifier;
import StructuralPatterns.Decorator.Example01.notifier.impl.EmailNotifier;

public class Main {

    public static void main(String[] args) {
        System.out.println("--- Basic Notification ---");
        Notifier stack = new EmailNotifier("admin@example.com");
        stack.send("Server is down!");

        // Adding SMS functionality
        System.out.println("\n--- Adding SMS ---");
        stack = new SMSDecorator(stack);
        stack.send("Database connection lost!");

        // Adding Facebook functionality (Wrapping the previous stack)
        System.out.println("\n--- Adding Facebook ---");
        stack = new FacebookDecorator(stack);
        stack.send("Critical system failure!");
    }
}

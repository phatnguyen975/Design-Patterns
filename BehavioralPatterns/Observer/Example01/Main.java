package BehavioralPatterns.Observer.Example01;

import BehavioralPatterns.Observer.Example01.editor.Editor;
import BehavioralPatterns.Observer.Example01.listeners.impl.EmailNotificationListener;
import BehavioralPatterns.Observer.Example01.listeners.impl.LogOpenListener;

public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

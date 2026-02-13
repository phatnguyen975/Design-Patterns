package CreationalPatterns.FactoryMethod.Example02.buttons.impl;

import CreationalPatterns.FactoryMethod.Example02.buttons.Button;

public class HtmlButton implements Button {

    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}

package CreationalPatterns.FactoryMethod.Example02.factory;

import CreationalPatterns.FactoryMethod.Example02.buttons.Button;

public abstract class Dialog {

    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
}

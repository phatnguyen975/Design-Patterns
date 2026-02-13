package CreationalPatterns.FactoryMethod.Example02.factory;

import CreationalPatterns.FactoryMethod.Example02.buttons.Button;
import CreationalPatterns.FactoryMethod.Example02.buttons.impl.HtmlButton;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

package CreationalPatterns.FactoryMethod.Example01.logistics;

import CreationalPatterns.FactoryMethod.Example01.transport.Transport;
import CreationalPatterns.FactoryMethod.Example01.transport.impl.Ship;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

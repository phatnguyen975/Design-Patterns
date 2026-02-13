package CreationalPatterns.FactoryMethod.Example01.logistics;

import CreationalPatterns.FactoryMethod.Example01.transport.Transport;
import CreationalPatterns.FactoryMethod.Example01.transport.impl.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

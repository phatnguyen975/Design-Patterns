package CreationalPatterns.FactoryMethod.Example01.logistics;

import CreationalPatterns.FactoryMethod.Example01.transport.Transport;

public abstract class Logistics {

    // The Factory Method
    public abstract Transport createTransport();

    // Core Business Logic
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

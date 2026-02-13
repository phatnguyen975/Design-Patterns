package CreationalPatterns.FactoryMethod.Example01.transport.impl;

import CreationalPatterns.FactoryMethod.Example01.transport.Transport;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a container.");
    }
}

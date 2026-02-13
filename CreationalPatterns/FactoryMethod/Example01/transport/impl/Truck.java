package CreationalPatterns.FactoryMethod.Example01.transport.impl;

import CreationalPatterns.FactoryMethod.Example01.transport.Transport;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Delivering by land in a box.");
    }
}

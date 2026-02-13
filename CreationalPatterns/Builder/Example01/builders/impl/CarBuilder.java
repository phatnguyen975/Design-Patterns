package CreationalPatterns.Builder.Example01.builders.impl;

import CreationalPatterns.Builder.Example01.builders.Builder;
import CreationalPatterns.Builder.Example01.cars.Car;
import CreationalPatterns.Builder.Example01.cars.CarType;
import CreationalPatterns.Builder.Example01.components.Engine;
import CreationalPatterns.Builder.Example01.components.GPSNavigator;
import CreationalPatterns.Builder.Example01.components.Transmission;
import CreationalPatterns.Builder.Example01.components.TripComputer;

public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

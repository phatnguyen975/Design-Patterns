package CreationalPatterns.Builder.Example01.builders;

import CreationalPatterns.Builder.Example01.cars.CarType;
import CreationalPatterns.Builder.Example01.components.Engine;
import CreationalPatterns.Builder.Example01.components.GPSNavigator;
import CreationalPatterns.Builder.Example01.components.Transmission;
import CreationalPatterns.Builder.Example01.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

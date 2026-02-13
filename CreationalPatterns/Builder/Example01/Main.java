package CreationalPatterns.Builder.Example01;

import CreationalPatterns.Builder.Example01.builders.impl.CarBuilder;
import CreationalPatterns.Builder.Example01.builders.impl.CarManualBuilder;
import CreationalPatterns.Builder.Example01.cars.Car;
import CreationalPatterns.Builder.Example01.cars.Manual;
import CreationalPatterns.Builder.Example01.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}

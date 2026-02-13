package CreationalPatterns.FactoryMethod.Example01;

import CreationalPatterns.FactoryMethod.Example01.logistics.Logistics;
import CreationalPatterns.FactoryMethod.Example01.logistics.RoadLogistics;
import CreationalPatterns.FactoryMethod.Example01.logistics.SeaLogistics;

public class Main {

    private static Logistics logistics;

    public static void main(String[] args) {
        // Configuration usually comes from external source
        String type = "SEA";

        if (type.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else {
            logistics = new SeaLogistics();
        }

        logistics.planDelivery();
    }
}

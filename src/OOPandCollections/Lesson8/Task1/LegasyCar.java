package OOPandCollections.Lesson8.Task1;

public class LegasyCar implements Car {

   String carNumber;
   double fuelLevel;
   double fuelConsumption;

    @Override
    public void start() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void fly() {
        Car.super.fly();
    }
}

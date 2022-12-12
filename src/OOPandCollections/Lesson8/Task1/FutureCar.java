package OOPandCollections.Lesson8.Task1;

public class FutureCar implements Car {

    double flyingHeight;
    int wings;

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

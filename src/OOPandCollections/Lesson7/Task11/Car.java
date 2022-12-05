package OOPandCollections.Lesson7.Task11;

public abstract class Car extends WheeledVehicle {

    String carNumber;
    int seats;
    boolean engineStatus;

    @Override
    void turnOn() {
        engineStatus = true;
    }

    @Override
    void turnOff() {
        engineStatus = false;
    }


}

package OOPandCollections.Lesson4.Transport;

public class Car extends Vehicle{
    public String carType;
    public String safetySystem;
    public String mediaSystem;

    public Car(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus, String engineType, String vehicleNumber, double fuelLevel, String carType, String safetySystem, String mediaSystem) {
        super(color, weight, passengersCapacity, baggageCapacity, totalTrip, engineStatus, engineType, vehicleNumber, fuelLevel);
        this.carType = carType;
        this.safetySystem = safetySystem;
        this.mediaSystem = mediaSystem;
    }

    public String getSafetySystem() {
        return safetySystem;
    }

    public void setSafetySystem(String safetySystem) {
        this.safetySystem = safetySystem;
    }

    public String getMediaSystem() {
        return mediaSystem;
    }

    public void setMediaSystem(String mediaSystem) {
        this.mediaSystem = mediaSystem;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}

package OOPandCollections.Lesson4.Transport;

public class Vehicle extends Transport{
    public String engineType;
    public String vehicleNumber;
    public double fuelLevel;

    public Vehicle(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus, String engineType, String vehicleNumber, double fuelLevel) {
        super(color, weight, passengersCapacity, baggageCapacity, totalTrip, engineStatus);
        this.engineType = engineType;
        this.vehicleNumber = vehicleNumber;
        this.fuelLevel = fuelLevel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}

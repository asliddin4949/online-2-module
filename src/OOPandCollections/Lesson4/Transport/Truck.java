package OOPandCollections.Lesson4.Transport;

public class Truck extends Vehicle{
    public String truckType;
    public String directionsType;
    public String driversLicence;

    public Truck(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus, String engineType, String vehicleNumber, double fuelLevel, String truckType, String directionsType, String driversLicence) {
        super(color, weight, passengersCapacity, baggageCapacity, totalTrip, engineStatus, engineType, vehicleNumber, fuelLevel);
        this.truckType = truckType;
        this.directionsType = directionsType;
        this.driversLicence = driversLicence;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public String getDirectionsType() {
        return directionsType;
    }

    public void setDirectionsType(String directionsType) {
        this.directionsType = directionsType;
    }

    public String getDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }
}

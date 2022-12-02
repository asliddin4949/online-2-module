package OOPandCollections.Lesson4.Transport;

public class Tram extends Train{
    public double energyPower;
    public double energyConsumption;

    public Tram(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus, int wagonNumbers, int numberOfIronWheels, String typeOfWagon, int numberSeats, double energyPower, double energyConsumption) {
        super(color, weight, passengersCapacity, baggageCapacity, totalTrip, engineStatus, wagonNumbers, numberOfIronWheels, typeOfWagon, numberSeats);
        this.energyPower = energyPower;
        this.energyConsumption = energyConsumption;
    }

    public double getEnergyPower() {
        return energyPower;
    }

    public void setEnergyPower(double energyPower) {
        this.energyPower = energyPower;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(double energyConsumption) {
        this.energyConsumption = energyConsumption;
    }
}

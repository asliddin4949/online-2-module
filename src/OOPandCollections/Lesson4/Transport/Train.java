package OOPandCollections.Lesson4.Transport;

public class Train extends Transport{
    public int wagonNumbers;
    public int numberOfIronWheels;
    public String typeOfWagon;
    public int numberSeats;

    public Train(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus, int wagonNumbers, int numberOfIronWheels, String typeOfWagon, int numberSeats) {
        super(color, weight, passengersCapacity, baggageCapacity, totalTrip, engineStatus);
        this.wagonNumbers = wagonNumbers;
        this.numberOfIronWheels = numberOfIronWheels;
        this.typeOfWagon = typeOfWagon;
        this.numberSeats = numberSeats;
    }

    public int getWagonNumbers() {
        return wagonNumbers;
    }

    public void setWagonNumbers(int wagonNumbers) {
        this.wagonNumbers = wagonNumbers;
    }

    public int getNumberOfIronWheels() {
        return numberOfIronWheels;
    }

    public void setNumberOfIronWheels(int numberOfIronWheels) {
        this.numberOfIronWheels = numberOfIronWheels;
    }

    public String getTypeOfWagon() {
        return typeOfWagon;
    }

    public void setTypeOfWagon(String typeOfWagon) {
        this.typeOfWagon = typeOfWagon;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }
}

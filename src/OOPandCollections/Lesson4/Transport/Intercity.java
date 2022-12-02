package OOPandCollections.Lesson4.Transport;

public class Intercity extends Train{
    public int numberOfBusinessSeats;
    public int numberOfSeats;

    public Intercity(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus, int wagonNumbers, int numberOfIronWheels, String typeOfWagon, int numberSeats, int numberOfBusinessSeats, int numberOfSeats) {
        super(color, weight, passengersCapacity, baggageCapacity, totalTrip, engineStatus, wagonNumbers, numberOfIronWheels, typeOfWagon, numberSeats);
        this.numberOfBusinessSeats = numberOfBusinessSeats;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfBusinessSeats() {
        return numberOfBusinessSeats;
    }

    public void setNumberOfBusinessSeats(int numberOfBusinessSeats) {
        this.numberOfBusinessSeats = numberOfBusinessSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}

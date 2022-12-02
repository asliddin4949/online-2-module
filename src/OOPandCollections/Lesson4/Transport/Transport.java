package OOPandCollections.Lesson4.Transport;

public class Transport {

    public String color;
    public double weight;
    public int passengersCapacity;
    public double baggageCapacity;
    public double totalTrip;
    public boolean engineStatus;

    public Transport(String color, double weight, int passengersCapacity, double baggageCapacity, double totalTrip, boolean engineStatus) {
        this.color = color;
        this.weight = weight;
        this.passengersCapacity = passengersCapacity;
        this.baggageCapacity = baggageCapacity;
        this.totalTrip = totalTrip;
        this.engineStatus = engineStatus;
    }

    public void drive(double distance) {
        if (engineStatus) {
            this.totalTrip += distance;
        } else {
            System.err.println("start engine");
        }
    }

    public double getBaggageCapacity() {
        return baggageCapacity;
    }

    public void setBaggageCapacity(double baggageCapacity) {
        this.baggageCapacity = baggageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public double getTotalTrip() {
        return totalTrip;
    }

    public void setTotalTrip(double totalTrip) {
        this.totalTrip = totalTrip;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }
}

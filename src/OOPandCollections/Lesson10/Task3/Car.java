package OOPandCollections.Lesson10.Task3;

public class Car {

    String color;
    String model;
    String carNumber;

    public Car(String color, String model, String carNumber) {
        this.color = color;
        this.model = model;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car[" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ']';
    }

    public String getModel() {
        return model;
    }
}

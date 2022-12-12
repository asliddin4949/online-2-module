package OOPandCollections.Lesson10.Task3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("white", "tracker", "75H002NA");
        Car car2 = new Car("silver", "hyundai_accent", "01H003CB");
        Car car3 = new Car("white", "lexus_460", "30S003TA");
        Car car4 = new Car("grey", "kia_k5", "75R550OA");
        Car car5 = new Car("black", "prado", "01B680XB");
        Car car6 = new Car("white", "captiva", "10B101PA");
        Car car7 = new Car("white", "cobalt", "01C240UB");
        Car car8 = new Car("white", "cobalt", "01U268WB");
        Car car9 = new Car("black", "malibu", "10R300RA");
        Car car10 = new Car("black", "malibu", "75F770FA");

        List<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10));

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toString());
        }

        System.out.println("===Random Car===");

        Car randomCar = getRandom(cars);

        System.out.println(randomCar.toString());

        List<Car> cars1 = new ArrayList<>(Arrays.asList(
                new Car("black", "jetour", "75H003SS"),
                new Car("white", "lexus_570", "01777AAA"),
                new Car("black", "amg_g63", "01721UZB"),
                new Car("black", "maybach_w222", "01707UZB"),
                new Car("white", "matiz", "75Z160KA")
        ));

        System.out.println("added from second index");
        cars.addAll(2, cars1);


        System.out.println();
        for (Car car : cars) {
            System.out.println(car.toString());
        }

        System.out.println("===sorting by model===");
        Comparator<Car> carComparator = Comparator.comparing(Car::getModel);

        cars.sort(carComparator);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("===remove cars1===");

        List<Car> carsRemoved = new ArrayList<>(cars);

        carsRemoved.removeAll(cars1);

        for (Car car : carsRemoved) {
            System.out.println(car);
        }

        System.out.println("===retain cars1===");

        List<Car> carsRetained = new ArrayList<>(cars);

        carsRetained.retainAll(cars1);

        for (Car car : carsRetained) {
            System.out.println(car);
        }

    }

    public static Car getRandom(List<Car> carList) {
        int i = (int) (Math.random() * 10);
        return carList.get(i);
    }
}

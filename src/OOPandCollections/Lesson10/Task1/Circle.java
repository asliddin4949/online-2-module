package OOPandCollections.Lesson10.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//1) Ichida double toifali radius fieldi bor Aylana (Circle) classini yarating.
// 2) Circle objectlarini saqlovchi circles1 nomli list yarating va ichiga 5 ta element joylashtiring.
// 3) Ichida Aylana toifasidagi elementlarini saqlovchi circles2 nomli list yarating va unga circles1 ning elementlarini joylashtiring.

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    List<Circle> circles1 = new ArrayList<>(Arrays.asList(
            new Circle(1.2),
            new Circle(2.4),
            new Circle(1.4),
            new Circle(1.3),
            new Circle(2.3)
    ));

    List<Circle> circles2 = new ArrayList<>(circles1);

}

package OOPandCollections.Lesson6.Figures;

public class Circle extends Figure {
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area = " + (PI * radius * radius));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = " + (2 * PI * radius));
    }
}

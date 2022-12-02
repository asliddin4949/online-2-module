package OOPandCollections.Lesson6.Figures;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = " + (2 * (sideA + sideB)));
    }

    @Override
    public void area() {
        System.out.println("Area = " + (sideA * sideB));
    }

}

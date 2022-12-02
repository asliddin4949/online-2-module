package OOPandCollections.Lesson6.Figures;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double hypotenuse = Math.sqrt(sideA * sideA + sideB * sideB);

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void area() {
        System.out.println("Area = " + (sideA * sideB) / 2);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter = " + (sideA + sideB + hypotenuse));
    }
}

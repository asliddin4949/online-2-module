package OOPandCollections.Lesson5.Figure;

public class Figure {
    final double PI=3.14;
    private double radius;
    private double side1;
    private double side2;

    public Figure(double radius) {
        this.radius = radius;
    }

    public Figure(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getRadius() {
        return radius;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double setArea(double side1, double side2){
        return side1*side2;
    }
    public double setArea(double radius){
        return this.PI*radius*radius;
    }
    public double perimeters(double side1, double side2){
        return 2*(side1+side2);
    }
    public double perimeters(double radius){
        return 2*this.PI*radius;
    }

}

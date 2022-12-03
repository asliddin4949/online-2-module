package OOPandCollections.Lesson7.Task1;

public class Circle extends Shape {
    private double radius;
    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}

package OOPandCollections.Lesson6.Figures;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4);
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(2.3);

        triangle.area();
        triangle.perimeter();
        rectangle.area();
        rectangle.perimeter();
        circle.area();
        circle.perimeter();

    }
}

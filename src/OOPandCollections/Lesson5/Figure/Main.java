package OOPandCollections.Lesson5.Figure;

public class Main {
    public static void main(String[] args) {
        Figure rectangular = new Figure(3.4,4);
        Figure circle = new Figure(2.4);

        System.out.println("Radius = "+circle.getRadius());
        System.out.println("Side1 = "+rectangular.getSide1()+"\nSide2 = "+rectangular.getSide2());
    }
}

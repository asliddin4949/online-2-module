package OOPandCollections.Lesson2.Pen;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setInqColor("dark blue");
        pen.setInq(164);
        pen.setInqConsumption(4);
        pen.clickButton();
        System.out.println("Pen color: " + pen.getInqColor()
                + "\nLeft Inq: " + pen.getInq());
        pen.write("We are learning OOP module on Java Backend in PDP Academy!");
        
    }
}

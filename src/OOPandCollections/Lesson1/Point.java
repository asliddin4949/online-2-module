package OOPandCollections.Lesson1;

public class Point {

    public int X;
    public int Y;

    public void setXY(int x, int y){
        this.X = x;
        this.Y = y;
    }

    public void printXY(){
        System.out.println("("+this.X+","+this.Y+")");
    }

    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(45,56);
        point.printXY();
    }

}

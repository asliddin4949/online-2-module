package OOPandCollections.Lesson1;

public class Triangle90 {

    public float catet1;
    public float catet2;

    public float hypotenuse;

    public void catets(float catet1, float catet2){
        this.catet1 = catet1;
        this.catet2 = catet2;
        this.hypotenuse = (float) Math.sqrt(this.catet1*this.catet1+this.catet2*this.catet2);
    }

    public float perimetres(){
        return this.catet1+this.catet2+this.hypotenuse;
    }
    public float square(){
        return this.catet1*this.catet2/2;
    }

    public static void main(String[] args) {
        Triangle90 triangle90 = new Triangle90();
        triangle90.catets(3,4);
        System.out.println("Perimeter: "+triangle90.perimetres());
        System.out.println("Square: "+triangle90.square());
    }


}

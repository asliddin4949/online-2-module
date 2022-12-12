package OOPandCollections.Lesson8.Task2;

public class Tiger implements Animal {
    double runningSpeed;
    String name;

    @Override
    public void sound() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    void attack(){

    }

    public static void main(String[] args) {
        Animal.run();
    }
}

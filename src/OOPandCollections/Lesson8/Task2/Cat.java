package OOPandCollections.Lesson8.Task2;

public class Cat implements Animal {
    String name;


    @Override
    public void sound() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    public static void main(String[] args) {
        Animal.run();
    }
}

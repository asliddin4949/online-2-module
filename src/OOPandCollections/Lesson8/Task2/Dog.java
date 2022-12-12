package OOPandCollections.Lesson8.Task2;

public class Dog implements Animal{
   String color;
   String name;

    @Override
    public void sound() {

    }

    @Override
    public void eat() {
        Animal.super.eat();
    }

    void guard(){

    }

    public static void main(String[] args) {
        Animal.run();
    }
}

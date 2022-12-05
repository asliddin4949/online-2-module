package OOPandCollections.Lesson7.Task8;

public abstract class Animal {
    int legs;

    public Animal() {
    }

    public Animal(int legs) {
        this.legs = legs;
    }

    abstract void walk();
    abstract void eat();
}

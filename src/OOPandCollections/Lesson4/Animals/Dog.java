package OOPandCollections.Lesson4.Animals;

public class Dog extends Pets{
    public double weight;

    public Dog(String color, int numberOfLegs, boolean isMammals, String name, double weight) {
        super(color, numberOfLegs, isMammals, name);
        this.weight = weight;
    }
}

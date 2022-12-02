package OOPandCollections.Lesson4.Animals;

public class Cat extends Pets{
    public String eyeColor;

    public Cat(String color, int numberOfLegs, boolean isMammals, String name, String eyeColor) {
        super(color, numberOfLegs, isMammals, name);
        this.eyeColor = eyeColor;
    }
}

package OOPandCollections.Lesson4.Animals;

public class Pets extends Animals{
    public String name;

    public Pets(String color, int numberOfLegs, boolean isMammals, String name) {
        super(color, numberOfLegs, isMammals);
        this.name = name;
    }
}

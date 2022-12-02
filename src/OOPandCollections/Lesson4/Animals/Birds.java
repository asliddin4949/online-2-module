package OOPandCollections.Lesson4.Animals;

public class Birds extends Animals{
    public boolean canFly;

    public Birds(String color, int numberOfLegs, boolean isMammals, boolean canFly) {
        super(color, numberOfLegs, isMammals);
        this.canFly = canFly;
    }
}

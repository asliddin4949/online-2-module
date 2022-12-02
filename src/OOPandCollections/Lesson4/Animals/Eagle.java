package OOPandCollections.Lesson4.Animals;

public class Eagle extends Birds{
    public double flyingHeight;

    public Eagle(String color, int numberOfLegs, boolean isMammals, boolean canFly, double flyingHeight) {
        super(color, numberOfLegs, isMammals, canFly);
        this.flyingHeight = flyingHeight;
    }
}

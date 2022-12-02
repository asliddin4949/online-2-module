package OOPandCollections.Lesson4.Animals;

public class Straus extends Birds{
    public double lengthOfLegs;

    public Straus(String color, int numberOfLegs, boolean isMammals, boolean canFly, double lengthOfLegs) {
        super(color, numberOfLegs, isMammals, canFly);
        this.lengthOfLegs = lengthOfLegs;
    }
}

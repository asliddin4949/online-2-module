package OOPandCollections.Lesson4.Animals;

public class Cow extends Pets{
    public double dailyMilk;

    public Cow(String color, int numberOfLegs, boolean isMammals, String name, double dailyMilk) {
        super(color, numberOfLegs, isMammals, name);
        this.dailyMilk = dailyMilk;
    }
}

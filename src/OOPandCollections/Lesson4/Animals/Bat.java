package OOPandCollections.Lesson4.Animals;

public class Bat extends Birds {
    public String liveTime;

    public Bat(String color, int numberOfLegs, boolean isMammals, boolean canFly, String liveTime) {
        super(color, numberOfLegs, isMammals, canFly);
        this.liveTime = liveTime;
    }
}

package OOPandCollections.Lesson7.Task4;

public abstract class Person implements Employee{
    String name;
    String address;
    String hairColor;
    String eyeColor;

    public abstract void newAddress(String address);

    public abstract void setName(String name);
}

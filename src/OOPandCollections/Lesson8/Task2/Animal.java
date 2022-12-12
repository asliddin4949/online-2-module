package OOPandCollections.Lesson8.Task2;

public interface Animal {
    void sound();

    default void eat() {
        System.out.println("eating");
    }

    static void run(){
        System.out.println("running");
    }
}

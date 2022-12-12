package OOPandCollections.Lesson9.Task1;

public class Main {
    public static void main(String[] args) {

        Ishora<Integer> integerIshora = (son) -> son > 0;

        System.out.println(integerIshora.ishora(-3) ? "Musbat" : "Manfiy");
        System.out.println(integerIshora.ishora(3) ? "Musbat" : "Manfiy");
    }
}

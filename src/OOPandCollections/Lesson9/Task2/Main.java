package OOPandCollections.Lesson9.Task2;

public class Main {

    public static void main(String[] args) {
        MaxNumber< Integer, Integer> maxNumber = (number1,number2)-> (number1 > number2) ? number1:number2;
        System.out.println(maxNumber.MaxNumber(34, 12));
    }
}

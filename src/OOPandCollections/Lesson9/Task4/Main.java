package OOPandCollections.Lesson9.Task4;

public class Main {
    public static void main(String[] args) {

        int[] arr1 = {12, 13, 22, 1, 10, 11, 9, 7, 4};


        HasNumberInArray hasNumberInArray = (number, arr) -> {
            for (int j : arr) {
                if (j == number) {
                    return true;
                }
            }
            return false;
        };

        System.out.println(hasNumberInArray.hasNumber(2, arr1) ? "Array has this number" : "Array doesn't have this number");
    }
}

package OOPandCollections.Lesson9.Task3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5, 9, 8, 7, 5};


        MaxOfArray maxOfArray = (array) -> {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        };

        System.out.println(maxOfArray.maxOfArray(arr));
    }
}

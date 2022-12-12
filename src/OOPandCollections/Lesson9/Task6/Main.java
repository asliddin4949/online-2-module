package OOPandCollections.Lesson9.Task6;

public class Main {
    public static void main(String[] args) {
        SumPositives sumPositives = (array) -> {
            long sum = 0;
            for (int i : array) {
                if (i > 0) {
                    sum += i;
                }
            }
            return sum;
        };

        int[] arr = {-1, -3, 2, 3, 4, 5, 0, 6, -7};

        System.out.println(sumPositives.sumPositives(arr));

    }
}

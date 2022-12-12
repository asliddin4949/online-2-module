package OOPandCollections.Lesson9.Task7;

public class Main {
    public static void main(String[] args) {
        SumOdds sumOdds = (array) -> {
            long sum = 0;
            for (int i : array) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
            return sum;
        };

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        System.out.println(sumOdds.sumOdds(arr));
    }
}

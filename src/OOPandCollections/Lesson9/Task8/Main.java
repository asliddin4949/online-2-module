package OOPandCollections.Lesson9.Task8;

public class Main {
    public static void main(String[] args) {
        CheckTub checkTub = (number) -> {
            if (number <= 1) {
                return false;
            }
                for (int i = 2; i < (number / 2 + 1); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
        };

        SumArray sumArray = (array) -> {
            long sum = 0;
            for (int i : array) {
                if (checkTub.isTub(i)) {
                    sum += i;
                }
            }
            return sum;
        };


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};


        System.out.println(sumArray.sumArray(arr));
    }
}

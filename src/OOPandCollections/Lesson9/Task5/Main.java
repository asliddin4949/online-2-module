package OOPandCollections.Lesson9.Task5;

public class Main {
    public static void main(String[] args) {
        SumArray sumArray = array -> {
            long sum = 0;
            for (int i : array) {
                sum+=i;
            }
            return sum;
        };

        int[] arr = {1,2,3,4,5};
        System.out.println(sumArray.sumArray(arr));
    }
}

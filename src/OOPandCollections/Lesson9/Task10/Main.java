package OOPandCollections.Lesson9.Task10;

public class Main {
    public static void main(String[] args) {
        CountUnli countUnli = (string) -> {
            int count = 0;
            for (int i = 0; i < string.length(); i++) {
                char c = string.charAt(i);
                boolean case1 = c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i';
                boolean case2 = c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I';
                if (case1 || case2) {
                    count++;
                }
            }
            return count;
        };

        String str = "Pdp online courses is available now!";

        System.out.println(countUnli.countUnli(str));

    }
}

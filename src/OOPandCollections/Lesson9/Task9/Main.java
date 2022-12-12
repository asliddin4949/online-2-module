package OOPandCollections.Lesson9.Task9;

public class Main {
    public static void main(String[] args) {
        SearchString searchString = (str1, str2) -> str1.contains(str2);

        String s1 = "PDP online";
        String s2 = "online";

        System.out.println(searchString.hasString(s1, s2) ? "Yes" : "No");

    }
}

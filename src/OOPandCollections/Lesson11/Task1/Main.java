package OOPandCollections.Lesson11.Task1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("hash1");
        strings.add("hash2");
        strings.add("hash3");
        strings.add("hash4");
        strings.add("hash5");
        strings.add("hash6");
        strings.add("hash7");
        strings.add("hash8");
        strings.add("hash9");
        strings.add("hash10");

        System.out.println("===iterator===");
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("===forEach()===");

        strings.forEach(string -> System.out.println(string));
    }
}

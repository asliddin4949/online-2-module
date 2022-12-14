package OOPandCollections.Lesson11.Task2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            int num = getRandom();
            if (linkedHashSet.contains(num)){
                i--;
            }else {
                linkedHashSet.add(num);
            }
        }

        linkedHashSet.forEach(System.out::println);

        System.out.println("===\"up from 400\" are deleted===");

        Iterator<Integer> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            if(iterator.next()>400){
                iterator.remove();
            }
        }
        linkedHashSet.forEach(System.out::println);
    }

    static int getRandom() {
        int num = (int) (Math.random() * 1000);
        if (num > 299 && num < 501) {
            return num;
        } else {
            return getRandom();
        }
    }
}

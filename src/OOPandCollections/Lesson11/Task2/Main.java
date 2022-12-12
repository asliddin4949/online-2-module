package OOPandCollections.Lesson11.Task2;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 0; i < 100; i++) {
            linkedHashSet.add(getRandom());
        }
        linkedHashSet.forEach(System.out::println);

        Iterator<Integer> iterator = linkedHashSet.iterator();

        while (iterator.hasNext()){
            if(iterator.next()>400){
                iterator.remove();
            }
        }
        System.out.println("===\"up from 400\" are deleted===");
        linkedHashSet.forEach(System.out::println);

    }

    static Integer getRandom() {
        Integer num = (int) (Math.random() * 1000);
        if (num > 299 && num < 501) {
            return num;
        } else {
            return getRandom();
        }
    }
}

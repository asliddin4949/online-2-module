package OOPandCollections.Lesson10.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

 //   1)	List yarating va unga 10 ta ism kiriting. List elementlarini Iterator orqali ekranga chiqazing.
 //   2)	Listning oxiriga “Xolmat” ismini kiriting
//   3)	Listning birinchi elementiga O’zingizni ismingizni kiriting.
//   4)	Listning 2 elementini Familiyangizga almashtiring
//   5)	Listni Array ga o’giring.
//   6)	Listni ichidan ozingizni Ismingiz va Failiyangizni o’chiring

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ahmad");
        names.add("Alisher");
        names.add("Sanjar");
        names.add("Ravshan");
        names.add("Shahzod");
        names.add("Sherzod");
        names.add("Kamol");
        names.add("Begzod");
        names.add("Behruz");
        names.add("Xolmat");

        System.out.println("===Iterator===");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        names.add(1,"Asliddin");

        names.set(2,"Muminov");

        names.toArray();

        System.out.println(names);

        names.remove("Asliddin");
        names.remove("Muminov");

        System.out.println(names);

    }
}

package OOPandCollections.Lesson10.Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(10);

        names.add("Asliddin");
        names.add("Alisher");
        names.add("Sanjar");
        names.add("Bahodir");
        names.add("Hadyatillo");
        names.add("Bekzod");
        names.add("Shoxrux");
        names.add("Utkir");
        names.add("Otabek");
        names.add("Habib");


       Comparator<String> comparator = (string1,string2 )-> string1.compareTo(string2);

       names.sort(comparator);

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===deleted \"A\"===");

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).startsWith("A")){
                names.remove(i);
                i--;
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}

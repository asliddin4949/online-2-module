package OOPandCollections.Lesson10.Task5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(50);

        for (int i = 0; i < 50; i++){
            numbers.add(getRandom());
        }

       for (int i = 0; i<50; i++ ){
           System.out.println(i+1+" - "+numbers.get(i));
       }
    }

    static int getRandom(){
        return (int) ((Math.random()*100+1));
    }
}

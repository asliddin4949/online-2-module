package OOPandCollections.Lesson12.Task2;

import OOPandCollections.Lesson12.Task1.Fruit;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Fruit, Double> fruits = new HashMap<>();
        Fruit anor1 = new Fruit("Anor", "Quva", 0);
        Fruit anor2 = new Fruit("Anor", "Tuya tish", 0);
        Fruit anor3 = new Fruit("Anor", "Surxon", 0);
        Fruit olma1 = new Fruit("Olma", "Besh yuldiz", 0);
        Fruit olma2 = new Fruit("Olma", "Golden", 0);
        Fruit olma3 = new Fruit("Olma", "Qirmizi", 0);
        Fruit olma4 = new Fruit("Olma", "Semerenke", 0);
        Fruit banan1 = new Fruit("Banan", "Bananza", 5);
        Fruit banan2 = new Fruit("Banan", "Boshqa", 5);
        Fruit shaftoli1 = new Fruit("Shaftoli", "Tukli", 0);
        Fruit shaftoli2 = new Fruit("Shaftoli", "Tuksiz", 0);
        Fruit kivi1 = new Fruit("Kivi", "Import", 0);
        Fruit kivi2 = new Fruit("Kivi", "Mahalliy", 0);
        Fruit qulupnay1 = new Fruit("Qulupnay", "Yirik", 0);
        Fruit qulupnay2 = new Fruit("Qulupnay", "Mayda", 0);
        Fruit uzum1 = new Fruit("Uzum", "Qora", 0);
        Fruit uzum2 = new Fruit("Uzum", "Husayni", 0);
        Fruit urik1 = new Fruit("O'rik", "Surxon", 0);
        Fruit urik2 = new Fruit("O'rik", "Oq", 0);
        Fruit urik3 = new Fruit("O'rik", "Yirik", 0);

        fruits.put(anor1, 15000D);
        fruits.put(anor2, 16000D);
        fruits.put(anor3, 14000D);
        fruits.put(olma1, 9000D);
        fruits.put(olma2, 8000D);
        fruits.put(olma3, 15000D);
        fruits.put(olma4, 6000D);
        fruits.put(banan1, 30000D * ((100 - banan1.getSale()) / 100D));
        fruits.put(banan2, 20000D * ((100 - banan2.getSale()) / 100D));
        fruits.put(shaftoli1, 6000D);
        fruits.put(shaftoli2, 8000D);
        fruits.put(kivi1, 21000D);
        fruits.put(kivi2, 20000D);
        fruits.put(qulupnay1, 18000D);
        fruits.put(qulupnay2, 9000D);
        fruits.put(uzum1, 10000D);
        fruits.put(uzum2, 15000D);
        fruits.put(urik1, 3000D);
        fruits.put(urik2, 2000D);
        fruits.put(urik3, 12000D);
        System.out.println("===fruits starting with \"A\"===");
        fruits.forEach((fruit, aDouble) -> {
            if (fruit.getName().startsWith("A")) {
                System.out.println(fruit + "\nNarxi = " + aDouble);
            }
        });
        System.out.println("===fruits costs above 5000===");
        fruits.forEach((fruit, aDouble) -> {
            if (aDouble > 5000D) {
                System.out.println(fruit + "\nNarxi = " + aDouble);
            }
        });

        System.out.println("===10% off===");
        HashMap<Fruit, Double> fruits10PercentOff = new HashMap<>(fruits);

        fruits10PercentOff.replaceAll((fruit, aDouble) -> aDouble * 0.9D);
        fruits10PercentOff.forEach((fruit, aDouble) -> System.out.println(fruit + "\nNarxi = " + aDouble));

        System.out.println("===20%off===");
        HashMap<Fruit, Double> fruit20PercentOff = new HashMap<>(fruits);
        fruit20PercentOff.replaceAll((fruit, aDouble) -> aDouble > 10000D ? aDouble * 0.8D : aDouble);
        fruit20PercentOff.forEach((fruit, aDouble) -> System.out.println(fruit + "\nNarxi = " + aDouble));

        System.out.println("===30%off===");
        HashMap<Fruit, Double> fruit30PercentOff = new HashMap<>(fruits);

        fruit30PercentOff.forEach((fruit, aDouble) -> {
            if(aDouble>20000D){
                fruit.setSale(fruit.getSale()+10);
            }
        });
        fruit30PercentOff.replaceAll((fruit, aDouble) -> aDouble > 20000D ? aDouble * 0.6D : aDouble);
        fruit30PercentOff.forEach((fruit, aDouble) -> System.out.println(fruit + "\nNarxi = " + aDouble));


    }
}

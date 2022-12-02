package OOPandCollections.Lesson5.AddAttributes;

public class Main {
    public static void main(String[] args) {
        AddAttributes addAttributes = new AddAttributes();
        System.out.println(addAttributes.attributesAdd(3, 4));
        System.out.println(addAttributes.attributesAdd(3, 4.5));
        System.out.println(addAttributes.attributesAdd(3.5, 4.5,5.5));
        System.out.println(addAttributes.attributesAdd("PDP", "Online"));
        System.out.println(addAttributes.attributesAdd(5, "-stars"));


    }
}

package OOPandCollections.Lesson8.Task4;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("Functional Interface - 1: " + myClass.add(12, 13));

        OperationSub operationSub = new OperationSub() {
            @Override
            public int sub(int num1, int num2) {
                return num1 - num2;
            }
        };
        System.out.println("Functional Interface - 2: " + operationSub.sub(5, 3));

        OperationMultiply operationMultiply = (num1, num2) -> num1 * num2;

        System.out.println("Functional Interface - 3: " + operationMultiply.multiply(3, 5));

        OperationDiv operationDiv = (num1, num2) -> (double) num1 / num2;

        System.out.println("Functional Interface - 4: " + operationDiv.div(7, 2));

        OperationModule operationModule = (num) -> num < 0 ? (-1 * num) : num;

        System.out.println("Functional Interface - 5: "+operationModule.module(-4));

    }
}

package OOPandCollections.Lesson5.Calculator;

public class Calculator {

    public static int add(int num1, int num2){
        return num1+num2;
    }
    public static double add(double num1, int num2){
        return num1+num2;
    }
    public static double add(int num1, double num2){
        return num1+num2;
    }
    public static double add(double num1, double num2){
        return num1+num2;
    }
    public static long add(long num1, long num2){
        return num1+num2;
    }
    public static double add(long num1, double num2){
        return num1+num2;
    }
    public static double add(double num1, long num2){
        return num1+num2;
    }

    public static double div(int num1, int num2){
        return (double) num1/num2;
    }
    public static double div(double num1, int num2){
        return num1/num2;
    }
    public static double div(int num1, double num2){
        return num1/num2;
    }
    public static double div(double num1, double num2){
        return num1/num2;
    }
    public static double div(long num1, long num2){
        return (double) num1/num2;
    }
    public static double div(long num1, double num2){
        return num1/num2;
    }
    public static double div(double num1, long num2){
        return num1/num2;
    }

    public static long multiply(int num1, int num2){
        return (long) num1*num2;
    }
    public static double multiply(double num1, int num2){
        return num1*num2;
    }
    public static double multiply(int num1, double num2){
        return num1*num2;
    }
    public static double multiply(double num1, double num2){
        return num1*num2;
    }
    public static long multiply(long num1, long num2){
        return num1*num2;
    }
    public static double multiply(long num1, double num2){
        return num1*num2;
    }
    public static double multiply(double num1, long num2){
        return num1*num2;
    }

    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static double sub(double num1, int num2){
        return num1-num2;
    }
    public static double sub(int num1, double num2){
        return num1-num2;
    }
    public static double sub(double num1, double num2){
        return num1-num2;
    }
    public static long sub(long num1, long num2){
        return num1-num2;
    }
    public static double sub(long num1, double num2){
        return num1-num2;
    }
    public static double sub(double num1, long num2){
        return num1-num2;
    }

    public static int abs(int num){
        if (num < 0) {
            return (-1)*num;
        }else {
            return num;
        }
    }
    public static float abs(float num){
        if (num < 0) {
            return (-1)*num;
        }else {
            return num;
        }
    }
    public static double abs(double num){
        if (num < 0) {
            return (-1)*num;
        }else {
            return num;
        }
    }
    public static long abs(long num){
        if (num < 0) {
            return (-1)*num;
        }else {
            return num;
        }
    }

    public static long pow(int num){
        return (long) num*num;
    }
    public static long pow(long num){
        return num*num;
    }
    public static double pow(float num){
        return num*num;
    }
    public static double pow(double num){
        return num*num;
    }

}

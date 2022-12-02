package OOPandCollections.Lesson1;

public class MyClass {

    public int firstAtribut;
    public int secondAtribut;

    public void setAtributes(int firstAtribut, int secondAtribut){
        this.firstAtribut = firstAtribut;
        this.secondAtribut = secondAtribut;
    }
    public void aboutAtributes(){
        System.out.println("First = "+this.firstAtribut);
        System.out.println("Second = "+this.secondAtribut);
    }
    public void sumAtributes(){
        System.out.println("First+Second = "+(this.firstAtribut + this.secondAtribut));
    }
    public void maxAtribute(){
        if(this.firstAtribut>this.secondAtribut)
            System.out.println("Max = "+this.firstAtribut);
        System.out.println("Max = "+this.secondAtribut);

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.setAtributes(12,20);
        myClass.aboutAtributes();
        myClass.sumAtributes();
        myClass.maxAtribute();
    }

}

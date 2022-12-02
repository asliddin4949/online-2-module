package OOPandCollections.Lesson4.Book;

public class Book {

    public String author;
    public double cost;
    public int discountPercent;
    public String title;
    public int pages;

    public double setPrice() {
        return this.cost*1.25;
    }
    public double setCustomsFee(){
        return this.cost*0.3;
    }

}

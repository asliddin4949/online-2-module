package OOPandCollections.Lesson4.Book;

public class Ebook extends Book {
    public String downloadPath;
    public double downloadMB;

    public void printTitle(){
        System.out.println("Title: "+this.title);
    }
}

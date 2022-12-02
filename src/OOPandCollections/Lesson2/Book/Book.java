package OOPandCollections.Lesson2.Book;

public class Book {
    private String Bookname;
    private String[] authors = new String[10];
    private int authorid = 0;
    private String ISBN;
    private double cost;

    public Book(String bookname) {
        Bookname = bookname;
    }

    public void setISBN(String ISBN) {
        if (ISBN.length() > 12) {
            this.ISBN = ISBN;
        }
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAuthors(String author) {
        this.authors[this.authorid] = author;
        this.authorid++;
    }

    public String getBookname() {
        return Bookname;
    }

    public String[] getAuthors() {
        String[] authors = new String[this.authorid];
        for (int i = 0; i < this.authorid; i++) {
            authors[i] = this.authors[i];
        }
        return authors;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getCost() {
        return cost;
    }
}

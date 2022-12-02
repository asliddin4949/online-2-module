package OOPandCollections.Lesson2.Book;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Shaytanat");
        book.setAuthors("Toxir Malik");
        book.setAuthors("Asliddin Muminov");
        book.setISBN("0789943481824");
        book.setCost(28.45);

        System.out.println("Book info:"
                + "\nBook name: " + book.getBookname()
                + "\nAuthors: " + Arrays.toString(book.getAuthors())
                + "\nPrice: " + book.getCost() + " $"
                + "\nISBN: " + book.getISBN());
    }
}

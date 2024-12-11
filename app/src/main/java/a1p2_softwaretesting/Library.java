package a1p2_softwaretesting;

import java.util.ArrayList;
import java.util.List;

public class Library {

     private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book newBook) {
        books.add(newBook);
    }

    // Check if a book exists in the library
    public boolean has(Book book) {

        boolean contains = books.contains(book);
        return contains;
    }

}

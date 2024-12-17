package a1p2_softwaretesting;

import java.util.function.BooleanSupplier;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private String year;

    public Book(String title, String author, String isbn, String year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getYear() {
        return year;
    }

    public BooleanSupplier isLoaned() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLoaned'");
    }

    public void toggleLoanedStatus() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'toggleLoanedStatus'");
    }
}

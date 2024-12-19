package a1p2_softwaretesting;


public class Book {

    private String title;
    private String author;
    private String isbn;
    private String year;
    private boolean loaned = false; // New field to track loan status

        


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


    public boolean isLoaned() {
        return loaned; 
    }
    
    public void toggleLoanedStatus() {
        loaned = !loaned; 
    }


    /**
     * Return a string representation of the book.
     */
    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ") - ISBN: " + isbn;
    }
}

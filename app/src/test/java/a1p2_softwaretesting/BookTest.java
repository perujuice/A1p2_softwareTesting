package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void testBookConstructor() {
        // Arrange
        String title = "Effective Java";
        String author = "Joshua Bloch";
        String isbn = "978-0134685991";
        String year = "2018";

        // Act
        var sut = new Book(title, author, isbn, year);

        // Assert
        assertEquals(title, sut.getTitle(), "title does not match.");
        assertEquals(author, sut.getAuthor(), "author does not match.");
        assertEquals(isbn, sut.getIsbn(), "ISBN does not match.");
        assertEquals(year, sut.getYear(), "year does not match.");
    }


    @Test
    public void testLoanedStatusInitiallyFalse() {
        String title = "Effective Java";
        String author = "Joshua Bloch";
        String isbn = "978-0134685991";
        String year = "2018";
        var sut = new Book(title, author, isbn, year);
    
        assertFalse(sut.isLoaned(), "The book should not be loaned initially.");
    }
    
    @Test
    public void testLoanedStatusAfterToggling() {
        String title = "Effective Java";
        String author = "Joshua Bloch";
        String isbn = "978-0134685991";
        String year = "2018";
        var sut = new Book(title, author, isbn, year);
    
        sut.toggleLoanedStatus();
    
        assertTrue(sut.isLoaned(), "The book should be loaned after toggling.");
    
        sut.toggleLoanedStatus();
    
        assertFalse(sut.isLoaned(), "The book should not be loaned after toggling again.");
    }
    

}

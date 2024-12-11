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
        assertEquals(title, sut.getTitle(), "Book title does not match.");
        assertEquals(author, sut.getAuthor(), "Book author does not match.");
        assertEquals(isbn, sut.getIsbn(), "Book ISBN does not match.");
        assertEquals(year, sut.getYear(), "Book year does not match.");
    }
}
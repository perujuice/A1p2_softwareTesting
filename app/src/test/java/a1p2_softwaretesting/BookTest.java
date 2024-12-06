package a1p2_softwaretesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    private Book book;

    @BeforeEach
    public void setUp() {
        book = new Book("1984", "George Orwell", 1949, "9780451524935");
    }

    @Test
    public void testBookCreation() {
        assertEquals("1984", book.getTitle());  // Will fail intentionally for testing
        assertEquals("George Orwell", book.getAuthor());
        assertEquals(1949, book.getYear());
        assertEquals("9780451524935", book.getIsbn());
    }
}

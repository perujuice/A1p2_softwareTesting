package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.Test;

public class LibraryTest {

@Test
public void testAddBook() {

    var sut = new Library();

    Book mockBook = mock(Book.class);

    // Act
    sut.addBook(mockBook);

    // Assert
    var retrievedBook = sut.has(mockBook);
    assertNotNull(retrievedBook, "Book was not added to the library.");
    assertEquals(mockBook, retrievedBook, "The book returned by has is not the mockBook."); // Assert it matches mockBook.
}

@Test
public void testRemoveBook() {
    var sut = new Library();

    Book mockBook = mock(Book.class);
    sut.addBook(mockBook); // Add book first for removal

    // Act
    var removedBook = sut.removeBook("Test Title"); // Remove the book by title

    // Assert that the removed book is the same as the mock book
    assertEquals(mockBook, removedBook, "The removed book is not the mockBook."); 

    // Assert that the book is no longer in the library (retrievedBook should be null)
    var retrievedBook = sut.has(mockBook);
    assertNull(retrievedBook, "The book was not removed correctly.");
}
}

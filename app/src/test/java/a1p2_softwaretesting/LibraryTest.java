package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
}

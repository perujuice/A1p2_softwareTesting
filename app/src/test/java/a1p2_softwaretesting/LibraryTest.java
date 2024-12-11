package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertTrue;
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
    assertTrue(sut.has(mockBook), "Book was not added to the library.");
}}

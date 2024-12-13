package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        assertEquals(mockBook, retrievedBook, "The book returned by has is not the mockBook."); // Assert it matches
                                                                                                // mockBook.
    }

    @Test
    public void testRemoveBook() {
        var sut = new Library();

        Book mockBook = mock(Book.class);
        when(mockBook.getTitle()).thenReturn("Test Title"); // Stub the getTitle method
        sut.addBook(mockBook); // Add book first for removal

        // Act
        Book removedBook = sut.removeBook("Test Title"); // Remove the book by title

        // Assert that the removed book is the same as the mock book
        assertEquals(mockBook, removedBook, "The removed book is not the mockBook.");


        // Assert that the book is no longer in the library (retrievedBook should be
        // null)
        var retrievedBook = sut.has(mockBook);
        assertNull(retrievedBook, "The book was not removed correctly.");
    }

    @Test
    public void shouldReturnNullWhenRemovingNonExistentBook() {
        var sut = new Library();
        Book removedBook = sut.removeBook("Non Existent Title"); // Remove a book that does not exist

        assertNull(removedBook, "The removed book should be null.");
    }


    @Test
    public void testAddMember() {
        var sut = new Library();

        // Create a mock member
        Member mockMember = mock(Member.class);
        when(mockMember.getName()).thenReturn("Test Name"); // Stub getName method
        when(mockMember.getId()).thenReturn("12345"); // Stub getId method

        // Act
        sut.addMember(mockMember); // Add the mock member to the library

        // Assert
        var retrievedMember = sut.hasMember(mockMember); // Check if the member exists in the library
        assertNotNull(retrievedMember, "Member was not added to the library.");
        assertEquals(mockMember, retrievedMember, "The member returned by hasMember is not the mockMember."); // Assert
    }

    @Test
    public void hasMemberShouldReturnNullWhenMemberDoesNotExist() {
        var sut = new Library();
        Member mockMember = mock(Member.class); // Create a mock member

        var retrievedMember = sut.hasMember(mockMember); // Check if the member exists in the library
        assertNull(retrievedMember, "The member should not exist in the library.");
    }
}

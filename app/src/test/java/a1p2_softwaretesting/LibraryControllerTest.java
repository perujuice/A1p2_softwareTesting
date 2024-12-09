package a1p2_softwaretesting;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class LibraryControllerTest {
    
    @Test
    public void shouldCallAddBookWhenOption1IsSelected() {
        // Arrange
        var libraryMock = mock(Library.class);
        var viewMock = mock(LibraryView.class);
        var sut = new LibraryController(libraryMock, viewMock);

        when(viewMock.promptForBookTitle()).thenReturn("Test Title");
        when(viewMock.promptForBookAuthor()).thenReturn("Test Author");
        when(viewMock.promptForBookYear()).thenReturn("2021");
        when(viewMock.promptForBookIsbn()).thenReturn("1234567890");

        // Act
        sut.handleUserInput("1");

        // Assert
        verify(viewMock).promptForBookTitle();
        verify(viewMock).promptForBookAuthor();
        verify(viewMock).promptForBookIsbn();
        verify(sut).addBook(any(Book.class));
    }
}

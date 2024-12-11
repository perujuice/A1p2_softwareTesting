package a1p2_softwaretesting;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


public class LibraryControllerTest {
    
    @Test
    public void shouldCallAddBookWhenOption1IsSelected() {

        var libraryMock = mock(Library.class);
        var viewMock = mock(LibraryView.class);
        var sut = new LibraryController(libraryMock, viewMock);

        when(viewMock.promptForBookTitle()).thenReturn("Test Title");
        when(viewMock.promptForBookAuthor()).thenReturn("Test Author");
        when(viewMock.promptForBookYear()).thenReturn("2021");
        when(viewMock.promptForBookIsbn()).thenReturn("1234567890");

        sut.handleUserInput("1");

        verify(viewMock).promptForBookTitle();
        verify(viewMock).promptForBookAuthor();
        verify(viewMock).promptForBookYear();
        verify(viewMock).promptForBookIsbn();
        verify(libraryMock).addBook(any(Book.class));
    }  

    @Test
public void shouldCallRemoveBookWhenOption2IsSelected() {
    var libraryMock = mock(Library.class);
    var viewMock = mock(LibraryView.class);
    var sut = new LibraryController(libraryMock, viewMock);
    
    Book mockBook = mock(Book.class);
    when(viewMock.promptForBookTitle()).thenReturn("Test Title");
    libraryMock.addBook(mockBook);

    // Act
    sut.handleUserInput("2");

        // Assert
    verify(viewMock).promptForBookTitle();  // Ensure the title was prompted
    verify(libraryMock).removeBook(any(String.class));
    

}

}

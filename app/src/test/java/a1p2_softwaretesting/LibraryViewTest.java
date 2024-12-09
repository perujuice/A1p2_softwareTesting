package a1p2_softwaretesting;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class LibraryViewTest {
    

    @Test
    public void shouldDisplayWelcomeMessage() {
        PrintStream outStreamMock = mock(PrintStream.class);

        var sut = new LibraryView(outStreamMock);

        sut.displayWelcomeMessage();

        verify(outStreamMock).println(LibraryView.WELCOME);
    }

    @Test
    public void shouldDisplayConsoleMenu() {
        PrintStream outStreamMock = mock(PrintStream.class);

        var sut = new LibraryView(outStreamMock);

        sut.displayConsoleMenu();

        verify(outStreamMock).println("Library Management System Menu:");
        verify(outStreamMock).println("1. Add a book");
        verify(outStreamMock).println("2. Remove a book");
        verify(outStreamMock).println("3. Borrow a book");
        verify(outStreamMock).println("4. Return a book");
        verify(outStreamMock).println("5. List all books");
        verify(outStreamMock).println("6. Add a member");
        verify(outStreamMock).println("7. Remove a member");
        verify(outStreamMock).println("8. List all members");
        verify(outStreamMock).println("9. Exit");
        verify(outStreamMock).print("Please choose an option: ");
    }
}

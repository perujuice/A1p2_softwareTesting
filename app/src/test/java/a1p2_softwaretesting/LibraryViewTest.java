package a1p2_softwaretesting;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class LibraryViewTest {
    

    @Test
    public void shouldDisplayWelcomeMessage() {
        PrintStream outStreamMock = mock(PrintStream.class);

        var view = new LibraryView(outStreamMock);

        view.displayWelcomeMessage();

        verify(outStreamMock).println("Welcome to the Library!");
    }
}

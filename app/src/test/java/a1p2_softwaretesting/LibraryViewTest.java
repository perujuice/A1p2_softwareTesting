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
}

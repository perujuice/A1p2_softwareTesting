package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
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

        for (String option : LibraryView.MENU_OPTIONS) {
            if (option.equals("Please choose an option: ")) {
                verify(outStreamMock).print(option);
            } else {
                verify(outStreamMock).println(option);
            }
        }
    }

    @Test
    public void shouldGetUserInput() {
        String simulatedInput = "1";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); // Set the input stream to the simulated input.

        var sut = new LibraryView(System.out);
        String userInput = sut.getUserInput();

        assertEquals(simulatedInput, userInput);
    }

}

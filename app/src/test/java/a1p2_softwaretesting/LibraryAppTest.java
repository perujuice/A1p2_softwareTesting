package a1p2_softwaretesting;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.inOrder;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;


// Testing the start of the cosnsole application.
public class LibraryAppTest {

    
    @Test
    public void shouldShowWelcomeBeforeMenu() {
        var viewMock = mock(LibraryView.class); // Create a mock object of the LibraryView class
        var sut = new LibraryApp(viewMock); // Create a new LibraryApp object

        InOrder inOrder = inOrder(viewMock); // Create an InOrder object
        sut.start(); // Call the start() method

        inOrder.verify(viewMock).displayWelcomeMessage(); // Verify that the displayWelcomeMessage() method was called
        inOrder.verify(viewMock).displayConsoleMenu(); // Verify that the displayConsoleMenu() method was called

        verify(viewMock).displayConsoleMenu(); // Verify that the displayWelcomeMessage() method was called
    }

    @Test
    public void testLibraryAppMain() {
        PrintStream outStreamMock = mock(PrintStream.class); // Create a mock object of the PrintStream class
        PrintStream originalOutStream = System.out; // Save the original output stream
        var args = new String[0]; // Create an empty array of strings
        System.setOut(outStreamMock); // Set the output stream to the mock object
        LibraryApp.main(args);
        verify(outStreamMock).println(LibraryView.WELCOME); // Verify that the welcome message was printed
        System.setOut(originalOutStream); // Reset the output stream
    }
}

package a1p2_softwaretesting;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.inOrder;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;


// Testing the start of the cosnsole application.
// LibraryApp is like the controller in the MVC pattern.
public class LibraryAppTest {


    @Test
    public void shouldShowWelcomeBeforeMenu() {
        var viewMock = mock(LibraryView.class); // Create a mock object of the LibraryView class
        var controllerMock = mock(LibraryController.class); // Create a mock object of the LibraryController class
        var sut = new LibraryApp(viewMock, controllerMock); // Create a new LibraryApp object

        InOrder inOrder = inOrder(viewMock); // Create an InOrder object
        sut.start(); // Call the start() method

        inOrder.verify(viewMock).displayWelcomeMessage(); // Verify that the displayWelcomeMessage() method was called
        inOrder.verify(viewMock).displayConsoleMenu(); // Verify that the displayConsoleMenu() method was called

        verify(viewMock).displayConsoleMenu(); // Verify that the displayWelcomeMessage() method was called
    }

    @Test
    public void testOptionSelection1ByUser() {
        var viewMock = mock(LibraryView.class); 
        var controllerMock = mock(LibraryController.class);
        var sut = new LibraryApp(viewMock, controllerMock); 

        when(viewMock.getUserInput()).thenReturn("1");

        sut.start();

        verify(viewMock).displayWelcomeMessage();
        verify(controllerMock).handleUserInput("1");
    }

    @Test
    public void testLibraryAppMain() {
        // Arrange
        String simulatedInput = "9\n"; // Simulate user input to exit immediately
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        PrintStream outStreamMock = mock(PrintStream.class); // Create a mock object of the PrintStream class
        PrintStream originalOutStream = System.out; // Save the original output stream
        System.setOut(outStreamMock); // Set the output stream to the mock object

        // Act
        LibraryApp.main(new String[0]);

        // Assert
        verify(outStreamMock).println("Welcome to the Library!"); // Verify that the welcome message was printed
        verify(outStreamMock).println("Library Management System Menu:"); // Verify that the menu was printed
        verify(outStreamMock).print("Please choose an option: "); // Verify that the prompt was printed

        // Reset the output stream
        System.setOut(originalOutStream);
    }
}

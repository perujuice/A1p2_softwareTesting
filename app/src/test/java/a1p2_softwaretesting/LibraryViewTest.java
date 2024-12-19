package a1p2_softwaretesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.List;

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

    @Test
    public void shouldPromptForRemovingBook() {
        String simulatedInput = "Test Book Title";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); 
        PrintStream outStreamMock = mock(PrintStream.class);
    
        var sut = new LibraryView(outStreamMock);
    
        sut.promptForBookTitle();
    
        verify(outStreamMock).print("Enter the title of the book: ");
    }
    
    @Test
    public void shouldPromptForBookTitle() {
        String simulatedInput = "Test Book Title";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); 
        PrintStream outStreamMock = mock(PrintStream.class);
    
        var sut = new LibraryView(outStreamMock);
    
        sut.promptForBookTitle();
    
        verify(outStreamMock).print("Enter the title of the book: ");
    }

    @Test
    public void shouldPromptForBookAuthor() {
        String simulatedInput = "Test Book Author";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); 
        PrintStream outStreamMock = mock(PrintStream.class);
    
        var sut = new LibraryView(outStreamMock);
    
        sut.promptForBookAuthor();
    
        verify(outStreamMock).print("Enter the author of the book: ");
    }

    @Test
    public void shouldPromptForBookIsbn() {
        String simulatedInput = "Test Book ISBN";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); 
        PrintStream outStreamMock = mock(PrintStream.class);
    
        var sut = new LibraryView(outStreamMock);
    
        sut.promptForBookIsbn();
    
        verify(outStreamMock).print("Enter the ISBN of the book: ");
    }

    @Test
    public void shouldPromptForBookYear() {
        String simulatedInput = "2021";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes())); 
        PrintStream outStreamMock = mock(PrintStream.class);
    
        var sut = new LibraryView(outStreamMock);
    
        sut.promptForBookYear();
    
        verify(outStreamMock).print("Enter the year of the book: ");
    }

    @Test
    public void shouldDisplayBookRemovedSuccessfullyMessage() {
        String removedBook = "Test Book Title";
        PrintStream outStreamMock = mock(PrintStream.class);
        
        var sut = new LibraryView(outStreamMock);
        
        // Simulate the action of removing a book
        sut.displayBookRemovalResult(true, removedBook);
        
        
        verify(outStreamMock).println("Book removed successfully. Removed book details: " + removedBook);
    }
    
    @Test
    public void shouldDisplayBookRemovalFailedMessage() {
        String removedBook = "Nonexistent Book";
        PrintStream outStreamMock = mock(PrintStream.class);
        
        var sut = new LibraryView(outStreamMock);
        
        sut.displayBookRemovalResult(false, removedBook);
        
        verify(outStreamMock).println("Book removal failed. Book not found.");
    }

    
    @Test
    public void shouldDisplayBooksList() {
        PrintStream outStreamMock = mock(PrintStream.class);
        var sut = new LibraryView(outStreamMock);

        List<String> books = List.of("Harry Potter", "Lord of the Rings", "The Hobbit");

        // Execute the method
        sut.displayBooksList(books);

        // Verify each book is printed with the correct numbering
        int index = 1;
        for (String book : books) {
            verify(outStreamMock).println(index + ". " + book);
            index++;
        }

        // Verify the final prompt
        verify(outStreamMock).print("Please choose an option: ");
    }


    
}

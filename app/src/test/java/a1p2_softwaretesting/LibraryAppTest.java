package a1p2_softwaretesting;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;


// Testing the start of the cosnsole application.
public class LibraryAppTest {
    @Test
    public void testLibraryCreation() {
        var viewMock = mock(LibraryView.class);
        
        var sut = new LibraryApp(viewMock);

        sut.start();

        verify(viewMock).displayWelcomeMessage();
    }
}

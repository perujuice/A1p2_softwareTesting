package a1p2_softwaretesting;

import java.io.PrintStream;

public class LibraryView {
    private PrintStream outStream;

    public LibraryView(PrintStream outStream) {
        this.outStream = outStream;
    }

    public void displayWelcomeMessage() {
        outStream.println("Welcome to the Library!");
    }

}

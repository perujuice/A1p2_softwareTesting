package a1p2_softwaretesting;

import java.io.PrintStream;

public class LibraryView {
    private PrintStream outStream;
    public static String WELCOME = "Welcome to the Library!";

    public LibraryView(PrintStream outStream) {
        this.outStream = outStream;
    }

    public void displayWelcomeMessage() {
        outStream.println(WELCOME);
    }
}

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

    public void displayConsoleMenu() {
        outStream.println("Library Management System Menu:");
        outStream.println("1. Add a book");
        outStream.println("2. Remove a book");
        outStream.println("3. Borrow a book");
        outStream.println("4. Return a book");
        outStream.println("5. List all books");
        outStream.println("6. Add a member");
        outStream.println("7. Remove a member");
        outStream.println("8. List all members");
        outStream.println("9. Exit");
        outStream.print("Please choose an option: ");
    }
}

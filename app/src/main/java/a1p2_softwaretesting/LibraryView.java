package a1p2_softwaretesting;

import java.io.PrintStream;
import java.util.List;
import java.util.Scanner;

public class LibraryView {
    private PrintStream outStream;
    private Scanner scanner;
    public static String WELCOME = "Welcome to the Library!";
    public static final List<String> MENU_OPTIONS = List.of(
        "Library Management System Menu:",
        "1. Add a book",
        "2. Remove a book",
        "3. Borrow a book",
        "4. Return a book",
        "5. List all books",
        "6. Add a member",
        "7. Remove a member",
        "8. List all members",
        "9. Exit",
        "Please choose an option: "
    );

    public LibraryView(PrintStream outStream) {
        this.outStream = outStream;
        this.scanner = new Scanner(System.in);
    }

    public void displayWelcomeMessage() {
        outStream.println(WELCOME);
    }

    public void displayConsoleMenu() {
        for (String option : MENU_OPTIONS) {
            if (option.equals("Please choose an option: ")) {
                outStream.print(option);
            } else {
                outStream.println(option);
            }
        }
    }

    public String getUserInput() {
        return scanner.nextLine();
    }

    public Object promptForBookTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'promptForBookTitle'");
    }

    public Object promptForBookAuthor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'promptForBookAuthor'");
    }

    public Object promptForBookIsbn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'promptForBookIsbn'");
    }

    public Object promptForBookYear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'promptForBookYear'");
    }
}

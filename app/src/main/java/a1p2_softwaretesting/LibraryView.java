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

    /*
     * Constructor for the LibraryView class.
     */
    public LibraryView(PrintStream outStream) {
        this.outStream = outStream;
        this.scanner = new Scanner(System.in);
    }

    /*
     * Display the welcome message.
     */
    public void displayWelcomeMessage() {
        outStream.println(WELCOME);
    }

    /*
     * Display the console menu.
     */
    public void displayConsoleMenu() {
        for (String option : MENU_OPTIONS) {
            if (option.equals("Please choose an option: ")) {
                outStream.print(option);
            } else {
                outStream.println(option);
            }
        }
    }

    /* 
     * Get user input.
     */
    public String getUserInput() {
        return scanner.nextLine();
    }

    /*
     * Prompt the user for the title of the book.
     */
    public String promptForBookTitle() {
        outStream.print("Enter the title of the book: ");
        return scanner.nextLine();
    }

    /*
     * Prompt the user for the author of the book.
     */
    public String promptForBookAuthor() {
        outStream.print("Enter the author of the book: ");
        return scanner.nextLine();
    }

    /*
     * Prompt the user for the ISBN of the book.
     */
    public String promptForBookIsbn() {
        outStream.print("Enter the ISBN of the book: ");
        return scanner.nextLine();
    }

    /*
     * Prompt the user for the year of the book.
     */
    public String promptForBookYear() {
        outStream.print("Enter the year of the book: ");
        return scanner.nextLine();
    }
}

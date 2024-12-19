package a1p2_softwaretesting;

public class LibraryController {
    private Library library;
    private LibraryView view;

    /**
     * Constructor for the LibraryController class.
     * @param library 
     * @param view
     */
    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    /**
     * Handle user input based on the input received.
     * @param input The user input.
     * @return True if the application should continue running, false otherwise.
     */
    public boolean handleUserInput(String input) {
        switch (input) {
            case "1":
                addBook();
                return true;
            case "2":
                removeBook();
                return true;
            case "9":
                // Exit the application
                return false;
            default:
                // throw new IllegalArgumentException("Invalid input: " + input);
                return true;
        }
    }




    /**
     * Add a book to the library based on user input.
     */
    private void addBook() {
        String title = view.promptForBookTitle();
        String author = view.promptForBookAuthor();
        String isbn = view.promptForBookIsbn();
        String year = view.promptForBookYear();
        Book book = new Book(title, author, isbn, year);
        library.addBook(book);
    }

    /**
     * Remove a book from the library based on user input.
     */
    private void removeBook() {
        String title = view.promptForBookTitle();
        
        Book removedBook = library.removeBook(title);
    
        if (removedBook != null) {
            view.displayBookRemovalResult(true, removedBook.toString());
        } else {
            view.displayBookRemovalResult(false, title);
        }
    }
}
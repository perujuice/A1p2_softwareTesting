package a1p2_softwaretesting;

public class LibraryController {
    private Library library;
    private LibraryView view;

    /*
     * Constructor for the LibraryController class.
     */
    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    /*
     * Handle user input by calling the appropriate method based on the input.
     */
    public void handleUserInput(String input) {
        switch (input) {
            case "1":
                addBook();
                break;
            default:
                break;
        }
    }


    /*
     * Add a book to the library, by prompting the user for the book's title, author, ISBN, and year.
     */
    private void addBook() {
        String title = view.promptForBookTitle();
        String author = view.promptForBookAuthor();
        String isbn = view.promptForBookIsbn();
        String year = view.promptForBookYear();
        Book book = new Book(title, author, isbn, year);
        library.addBook(book);
    }
}

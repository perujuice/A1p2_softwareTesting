package a1p2_softwaretesting;

public class LibraryController {
    private Library library;
    private LibraryView view;

    public LibraryController(Library library, LibraryView view) {
        this.library = library;
        this.view = view;
    }

    public void handleUserInput(String input) {
        switch (input) {
            case "1":
                addBook();
                break;
            default:
                break;
        }
    }

    private void addBook() {
        String title = view.promptForBookTitle();
        String author = view.promptForBookAuthor();
        String isbn = view.promptForBookIsbn();
        String year = view.promptForBookYear();
        Book book = new Book(title, author, isbn, year);
        library.addBook(book);
    }
}

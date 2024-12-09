package a1p2_softwaretesting;

public class LibraryApp {
    private LibraryView view;

    public LibraryApp(LibraryView view) {
        this.view = view;
    }

    public void start() {
        this.view.displayWelcomeMessage();
    }
}

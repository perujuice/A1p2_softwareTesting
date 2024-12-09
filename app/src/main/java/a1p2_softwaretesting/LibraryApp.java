package a1p2_softwaretesting;

public class LibraryApp {
    private LibraryView view;

    public LibraryApp(LibraryView view, LibraryController controllerMock) {
        this.view = view;
    }

    public void start() {
        this.view.displayWelcomeMessage();
        this.view.displayConsoleMenu();
    }

    public static void main(String[] args) {
        LibraryView view = new LibraryView(System.out);
        LibraryApp app = new LibraryApp(view, null);
        app.start();
    }
}

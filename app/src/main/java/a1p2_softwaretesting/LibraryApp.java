package a1p2_softwaretesting;

public class LibraryApp {
    private LibraryView view;
    private LibraryController controller;

    public LibraryApp(LibraryView view, LibraryController controller) {
        this.view = view;
        this.controller = controller;
    }

    public void start() {
        this.view.displayWelcomeMessage();
        this.view.displayConsoleMenu();
        String userInput = this.view.getUserInput();
        this.controller.handleUserInput(userInput); 
    }

    public static void main(String[] args) {
        LibraryView view = new LibraryView(System.out);
        LibraryController controller = new LibraryController(null, view);
        LibraryApp app = new LibraryApp(view, controller);
        app.start();
    }
}

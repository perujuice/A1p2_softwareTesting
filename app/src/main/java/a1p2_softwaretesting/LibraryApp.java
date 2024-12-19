package a1p2_softwaretesting;

public class LibraryApp {
    private LibraryView view;
    private LibraryController controller;

    /**
     * Constructor for the LibraryApp class.
     * @param view 
     * @param controller
     */
    public LibraryApp(LibraryView view, LibraryController controller) {
        this.view = view;
        this.controller = controller;
    }

    /**
     * Start the library application.
     */
    public void start() {
        this.view.displayWelcomeMessage();
        boolean running = true;
        while (running) {
            this.view.displayConsoleMenu();
            String userInput = this.view.getUserInput();
            running = this.controller.handleUserInput(userInput); 
        }
    }

    /**
     * Main method to start the application.
     * @param args 
     */
    public static void main(String[] args) {
        LibraryView view = new LibraryView(System.out);
        Library libraryModel = new Library();
        LibraryController controller = new LibraryController(libraryModel, view);
        LibraryApp app = new LibraryApp(view, controller);
        app.start();
    }
}

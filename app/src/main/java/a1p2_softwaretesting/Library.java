package a1p2_softwaretesting;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> books;
  private List<Member> members;


  public Library() {
    this.books = new ArrayList<>();
    this.members = new ArrayList<>();

  }

  // Add a book to the library
  public void addBook(Book newBook) {
    books.add(newBook);
  }

  // Check if a book exists in the library
  public Book has(Book book) {
    if (books.contains(book)) {
      return book;
    }
    return null; 
  }

  public Book removeBook(String title) {
    // Find the book by title
    for (Book book : books) {
      if (book.getTitle().equals(title)) {
        books.remove(book); 
        return book; 
      }
    }
    return null;
  }

  public void addMember(Member mockMember) {
    members.add(mockMember);
  }

  public Object hasMember(Member mockMember) {
    if (members.contains(mockMember)) {
      return mockMember;
    }
    return null;
  }

  /**
   * Get a list of all books in the library.
   * @return A list of all books in the library.
   */
  public List<String> getBooks() {
    List<String> bookList = new ArrayList<>();
    for (Book book : books) {
      bookList.add(book.toString());
    }
    return bookList;
  }

}

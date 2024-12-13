package a1p2_softwaretesting;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
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
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addMember'");
  }

  public Object hasMember(Member mockMember) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasMember'");
  }

}

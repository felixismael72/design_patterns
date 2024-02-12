package structural.proxy;

public class RealBookService implements BookService {
  @Override
  public Book getBook(int id) {
    return fetchBookFromServer(id);
  }

  private Book fetchBookFromServer(int id) {
    System.out.println("Fetching book with id " + id + " from library server...");
    return new Book(id, "Sample Book Title", "Sample Author", "Sample Book Content");
  }
}

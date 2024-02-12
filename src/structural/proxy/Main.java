package structural.proxy;

public class Main {
  public static void main(String[] args) {
    BookService bookService = new CachedBookService(new RealBookService());

    Book book1 = bookService.getBook(101);
    System.out.println("Book 1 Title: " + book1.getTitle());
    System.out.println("Book 1 Author: " + book1.getAuthor());
    System.out.println("Book 1 Content: " + book1.getContent());

    Book book2 = bookService.getBook(101);
    System.out.println("Book 2 Title: " + book2.getTitle());
    System.out.println("Book 2 Author: " + book2.getAuthor());
    System.out.println("Book 2 Content: " + book2.getContent());
  }
}

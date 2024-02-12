package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedBookService implements BookService {
  private Map<Integer, Book> cache = new HashMap<>();
  private BookService realBookService;

  public CachedBookService(BookService realBookService) {
    this.realBookService = realBookService;
  }

  @Override
  public Book getBook(int id) {
    if (cache.containsKey(id)) {
      System.out.println("Book found in cache. Returning cached version...");
      return cache.get(id);
    } else {
      Book book = realBookService.getBook(id);
      cache.put(id, book);
      return book;
    }
  }
}

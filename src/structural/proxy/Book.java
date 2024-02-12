package structural.proxy;

public class Book {
  private int id;
  private String title;
  private String author;
  private String content;

  public Book(int id, String title, String author, String content) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.content = content;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public String getContent() {
    return content;
  }
}

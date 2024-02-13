package behavioral.memento;

public class Document {
  private String content;

  public Document(String content) {
    this.content = content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public Memento createMemento() {
    return new Memento(content);
  }

  public void restoreFromMemento(Memento memento) {
    this.content = memento.getContent();
  }
}

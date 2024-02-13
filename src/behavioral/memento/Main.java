package behavioral.memento;

public class Main {
  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();

    Document document = new Document("I started this text like this");
    System.out.println("I : " + document.getContent());

    caretaker.addMemento(document.createMemento());

    document.setContent("I updated this");
    System.out.println("II : " + document.getContent());

    caretaker.addMemento(document.createMemento());

    undoAndRedo(document, caretaker);

    document.setContent("Adding a new memento");
    System.out.println("III : " + document.getContent());

    caretaker.addMemento(document.createMemento());
    undoAndRedo(document, caretaker);
  }

  private static void undoAndRedo(Document document, Caretaker caretaker) {
    Memento undoMemento = caretaker.undo();
    if (undoMemento != null) {
      document.restoreFromMemento(undoMemento);
      System.out.println("Undo: " + document.getContent());
    }

    Memento redoMemento = caretaker.redo();
    if (redoMemento != null) {
      document.restoreFromMemento(redoMemento);
      System.out.println("Redo: " + document.getContent());
    }
  }
}

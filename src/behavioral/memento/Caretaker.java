package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  private final List<Memento> mementos;
  private int currentIndex;

  public Caretaker() {
    mementos = new ArrayList<>();
    currentIndex = -1;
  }

  public void addMemento(Memento memento) {
    mementos.add(memento);
    currentIndex++;
  }

  public Memento undo() {
    if (currentIndex > 0) {
      currentIndex--;
      return mementos.get(currentIndex);
    }
    return null;
  }

  public Memento redo() {
    if (currentIndex < mementos.size() - 1) {
      currentIndex++;
      return mementos.get(currentIndex);
    }
    return null;
  }
}

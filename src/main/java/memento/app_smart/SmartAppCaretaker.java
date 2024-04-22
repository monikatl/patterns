package memento.app_smart;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class SmartAppCaretaker {
  private List<SmartAppMemento> mementos = new ArrayList<SmartAppMemento>();

  public void addMemento(SmartAppMemento smartAppMemento) {
    mementos.add(smartAppMemento);
    System.out.println("Zaposana wersja: " + smartAppMemento.getVersion() + " znajduje się pod indeksem: " + (mementos.size()-1));
  }

  public SmartAppMemento getMemento(int index) {
    System.out.println("Wczytano wersję: " + mementos.get(index).getVersion().toString());
    return mementos.get(index);

  }
}

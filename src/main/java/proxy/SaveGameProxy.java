package proxy;

public class SaveGameProxy implements SavedGame{
  // pośrednik - odnośnik do obiektu
  // ominąć ładowanie z bazy danych
  // gdy nie jest możliwa modyfikacja klasy klienckiej
  // Context JPA Hibernate
  // Osoba - Proxy - obiekt mógł być wykorzystany - gdy jest potrzebny
  private String name;
  private SavedGame sg; // SavedGameFull
  @Override
  public void initialize() {
    this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
  }

  @Override
  public void loadGame() {
    sg = new SaveGameFull();
    sg.initialize();
    sg.loadGame();
  }

  @Override
  public String getName() {
    return this.name;
  }
}

package proxy;

import static java.lang.Thread.sleep;

public class SaveGameFull implements SavedGame {

  private String name;
  private String gameData;


  @Override
  public void initialize() {
    this.name = "Save Game - " + String.valueOf(System.currentTimeMillis());
    this.gameData = loadFromStorage();
  }

  @Override
  public void loadGame() {

  }

  private String loadFromStorage() {
    try {
      sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Loaded";
  }

  @Override
  public String getName() {
    return this.name;
  }
}

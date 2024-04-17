package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<SavedGame> savedGames = loadSavedGames();
    listSavedGames(savedGames);
  }

  public static List<SavedGame> loadSavedGames() {
    int savedamesCount = 20;
    List<SavedGame> savedGames = new ArrayList<>(savedamesCount);
    for(int i=0; i<20; i++) {
      SavedGame sg = new SaveGameProxy();
      sg.initialize();
      savedGames.add(sg);
    }
    return savedGames;
  }

  private static void listSavedGames(List<SavedGame> savedGames) {
    for(SavedGame savedGame : savedGames) {
      System.out.println(savedGame.getName());
    }
  }
}

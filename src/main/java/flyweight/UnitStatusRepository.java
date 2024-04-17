package flyweight;

// klasa pomocnicza
public class UnitStatusRepository {

  private UnitStatusRepository() {}
  private static UnitStats destroyerUnitStats = new UnitStats("Destroyer", 50, 100,50,25, 500);
  private static UnitStats teslaTankUnitStats = new UnitStats("Tank", 200, 100,50,25,500);

  private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 10, 100,50,25,10);
  public static UnitStats getDestroyerStats() {
    return destroyerUnitStats;
  }

  public static UnitStats getTeslTankStats() {
    return teslaTankUnitStats;
  }

  public static UnitStats getRiflemanUnitStats() {
    return riflemanUnitStats;
  }
}

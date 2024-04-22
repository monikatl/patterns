package strategy.chef;

public class Chef {
  private String name;
  private EggCooker eggCooker;

  public Chef(String name) {
    this.name = name;
  }


  public void cook() {
    this.eggCooker.cookEgg();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEggCooker(EggCooker eggCooker) {
    this.eggCooker = eggCooker;
  }
}

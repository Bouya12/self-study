public class Wizard extends Character {
  @Override
  public void doIntroduce() {
    System.out.println("職業は魔法使いです。");
  }
  public Wizard(String name) {
    super(name);
  }
}
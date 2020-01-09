public class Wizard {
  private int hp;
  private int mp;
  private String name;
  private Wand wand;

  public void heal(Hero h) {
    int basepoint = 10;   // ????????
    int recovPoint = (int) (basepoint * this.wand.power); // ??????
    h.setHp(h.getHp() + recovPoint);  // ???HP??????
    System.out.println(h.getName() + "?HP?" + recovPoint + "?????");
  }

  public int getHp() { return this.hp; }
  public void setHp(int hp) {
    if (hp < 0) { this.hp = 0; } else { this.hp = hp; }
  }

  public int getMp() { return this.mp; }
  public void setMp(int mp) {
    if (mp < 0) {
      throw new IllegalArgumentException("????????????????MP?????");
    }
    this.mp = mp;
  }

  public String getName() { return this.name; }
  public void setName(String name) {
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException("???????????????????????");
    }
    this.name = name;
  }

  public int getWand() { return this.wand; }
  public void setWand(Wand wand) {
    if (wand == null) {
      throw new IllegalArgumentException("??????????????????????");
    }
    this.wand = wand;
  }
}
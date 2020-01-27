import java.io.*;

public class Hero implements Serializable {
  private String name;
  private int hp;
  private int mp;

  public Hero(String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  @Override
  public String toString() {
    return "Hero [hp=" + hp + ", mp=" + mp + ", name=" + name + "]";
  }
}
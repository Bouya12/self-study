import java.util.Random;
/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Cleric c = new Cleric();
    c.name = "�m��";
    System.out.println(c.name + "�̗̑͂����������E�E�E");
    c.hp /= 2;
    c.selfAid();
    while (c.mp != c.maxMp) {
      c.pray(new Random().nextInt(2) + 1);
    }
  }
}
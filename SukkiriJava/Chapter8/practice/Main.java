import java.util.Random;
/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Cleric c = new Cleric();
    c.name = "‘m—µ";
    System.out.println(c.name + "‚Ì‘Ì—Í‚ª”¼Œ¸‚µ‚½EEE");
    c.hp /= 2;
    c.selfAid();
    while (c.mp != c.maxMp) {
      c.pray(new Random().nextInt(2) + 1);
    }
  }
}
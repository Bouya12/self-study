import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("ç÷ì°");
    Hero h2 = new Hero("óÈñÿ");
    ArrayList<Hero> heros = new ArrayList<>();
    heros.add(h1);
    heros.add(h2);
    for (Hero h : heros) {
      System.out.println(h.getName());
    }
  }
}
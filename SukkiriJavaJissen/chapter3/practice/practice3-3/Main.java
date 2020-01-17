import java.util.*;
public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("Ö“¡");
    Hero h2 = new Hero("—é–Ø");
    HashMap<Hero, Integer> heros = new HashMap<>();
    heros.put(h1, 3);
    heros.put(h2, 7);
    for (Hero key : heros.keySet()) {
      int value = heros.get(key);
      System.out.println(key.getName() + "‚ª“|‚µ‚½“G" + value);
    }
  }
}
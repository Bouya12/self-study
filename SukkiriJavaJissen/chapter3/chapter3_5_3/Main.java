import java.util.*;
public class Main {
  public static void main(String[] args) {
    Map<String, Integer> prefs = new HashMap<>();
    prefs.put("‹“s•{", 255);
    prefs.put("“Œ‹“s", 1261);
    prefs.put("ŒF–{Œ§", 182);
    for (String key : prefs.keySet()) {
      int value = prefs.get(key);
      System.out.println(key + "‚ÌlH‚ÍA" + value);
    }
  }
}
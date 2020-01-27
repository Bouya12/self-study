import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Writer fw = new FileWriter("rpgsave.properties")) {
      Properties p = new Properties();
      p.setProperty("heroName", "ÉAÉTÉJ");
      p.setProperty("heroHp", "62");
      p.setProperty("heroMp", "45");
      p.store(fw, "Hero's information");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
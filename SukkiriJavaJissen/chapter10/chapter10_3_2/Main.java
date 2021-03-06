import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Reader fr = new FileReader("rpgdata.properties");) {
      Properties p = new Properties();
      p.load(fr);
      String name = p.getProperty("heroName");
      String strHp = p.getProperty("heroHp");
      int hp = Integer.parseInt(strHp);
      System.out.println("勇者の名前:" + name);
      System.out.println("勇者のHP:" + hp);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
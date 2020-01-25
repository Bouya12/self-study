import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter(".\\rpgsave.dat", true);) {
      fw.write('A');
      fw.flush();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);) {
      fos.write(65);
      fos.flush();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
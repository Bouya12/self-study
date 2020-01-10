import java.io.*;
public class Main {
  public static void main(String[] args) {
    String filename = ".\\test.txt";
    try (
      FileReader fr = new FileReader(filename);
    ) {
      char c1 = (char) fr.read();
      char c2 = (char) fr.read();
      System.out.println(c1);
      System.out.println(c2);
    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
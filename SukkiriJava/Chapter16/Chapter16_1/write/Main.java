/**
 * Main
 */
import java.io.*;
 public class Main {
  public static void main(String[] args) {
    String filename = "test.txt";
    try {
      FileWriter fw = new FileWriter(filename);
      fw.write('‚»');
      fw.write('‚ê');
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
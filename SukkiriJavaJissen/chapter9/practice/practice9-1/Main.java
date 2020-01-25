import java.io.*;
public class Main {

  public static void main(String[] args) {
    String inFile = args[0];
    String outFile = args[1];
    try (FileInputStream fis = new FileInputStream(inFile);) {
      try (FileOutputStream fos = new FileOutputStream(outFile);) {
        int i = fis.read();
        while (i != -1) {
          fos.write(i);
          i = fis.read();
        }
        fos.flush();
      } catch (Exception e) {
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.exit(1);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
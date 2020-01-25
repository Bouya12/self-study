import java.io.*;
import java.util.zip.GZIPOutputStream;
public class Main {

  public static void main(String[] args) {
    String inFile = args[0];
    String outFile = args[1];
    try (FileInputStream fis = new FileInputStream(inFile);) {
      FileOutputStream fos = new FileOutputStream(outFile);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      try (GZIPOutputStream gzos = new GZIPOutputStream(bos);) {
        int i = fis.read();
        while (i != -1) {
          gzos.write(i);
          i = fis.read();
        }
        gzos.flush();
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
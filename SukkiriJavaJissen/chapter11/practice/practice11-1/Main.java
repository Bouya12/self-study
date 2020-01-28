import java.io.*;
import java.net.*;

public class Main {
  public static void main(String[] args) {
    // dokojavaのバージョンアップに伴いサンプルの画像は削除されていたため、
    // 代わりにGoogleの公式サイトからアイコンを取得
    try {
      URL url = new URL("https://www.google.com/favicon.ico");
      try (InputStream is = url.openStream()) {
        try (OutputStream os = new FileOutputStream("google.ico");) {
          int i = is.read();
          while (i != -1) {
            os.write((byte) i);
            i = is.read();
          }
          os.flush();
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
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
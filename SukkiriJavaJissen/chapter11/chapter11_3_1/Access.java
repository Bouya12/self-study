// Main.java にてサーバープログラムが起動完了している際に実行
import java.io.*;
import java.net.*;

public class Access {
  public static void main(String[] args) throws Exception {
    System.out.println("接続開始。");
    Socket sock = new Socket("localhost", 39648);
    InputStream is = sock.getInputStream();
    OutputStream os = sock.getOutputStream();
    InputStreamReader isr = new InputStreamReader(is);
    int i = isr.read();
    while (i != -1) {
      System.out.print((char) i);
      i = isr.read();
    }
    sock.close();
    System.out.println("\n接続終了。");
  }
}
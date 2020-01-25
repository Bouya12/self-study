import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("== 文字列型の変数から1文字ずつ読み込む ==");
    String msg = "第1土曜";
    Reader sr = new StringReader(msg);
    char[] c = new char[msg.length()];
    for (int i = 0; i < msg.length(); i++) {
      c[i] = (char) sr.read();
      System.out.println(c[i]);
    }

    System.out.println("== バイト配列に値を書き込む ==");
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    baos.write(65);
    baos.write(66);
    byte[] data = baos.toByteArray();
    char c0 = (char) data[0];
    char c1 = (char) data[1];
    System.out.println(c0);
    System.out.println(c1);
  }
}
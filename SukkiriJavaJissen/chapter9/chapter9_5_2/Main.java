import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("== ������^�̕ϐ�����1�������ǂݍ��� ==");
    String msg = "��1�y�j";
    Reader sr = new StringReader(msg);
    char[] c = new char[msg.length()];
    for (int i = 0; i < msg.length(); i++) {
      c[i] = (char) sr.read();
      System.out.println(c[i]);
    }

    System.out.println("== �o�C�g�z��ɒl���������� ==");
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
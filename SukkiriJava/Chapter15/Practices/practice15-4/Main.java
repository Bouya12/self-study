import java.io.IOException;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("�v���O�����N��");
    try {
      throw new IOException();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    try {
      String s = "�O";
      int i = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println("��O NumberFormatException �� catch ���܂���");
    }
  }
}
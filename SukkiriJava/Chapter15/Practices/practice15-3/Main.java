/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    try {
      String s = "三";
      int i = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println("例外 NumberFormatException を catch しました");
    }
  }
}
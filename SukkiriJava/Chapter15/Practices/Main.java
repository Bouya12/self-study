/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    String s;
    s = null;
    try {
      System.out.println(s.length());
    } catch (Exception e) {
      System.out.println("NullPointerException 例外を catch しました");
      System.out.println("－－スタックトレース（ここから）－－");
      e.printStackTrace();
      System.out.println("－－スタックトレース（ここまで）－－");
    }
  }
}
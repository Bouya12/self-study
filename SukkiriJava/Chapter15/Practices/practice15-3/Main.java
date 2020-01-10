/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    try {
      String s = "ŽO";
      int i = Integer.parseInt(s);
    } catch (NumberFormatException e) {
      System.out.println("—áŠO NumberFormatException ‚ð catch ‚µ‚Ü‚µ‚½");
    }
  }
}
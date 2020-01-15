public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 100; i++) {
      sb.append(i + ",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
    System.out.println(s);
    for (String w : a) {
      System.out.println(w);
    }
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String s = "�~�i�g�A�A�T�J�A�X�K����";
    StringTokenizer st = new StringTokenizer(s, ",");
    while (st.hasMoreTokens()) {
      String t = st.nextToken();
      System.out.println(t);
    }
  }
}
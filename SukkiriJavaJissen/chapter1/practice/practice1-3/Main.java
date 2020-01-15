public class Main {
  public static void main(String[] args) {
    String t1 = "aiueo";
    String t2_ok = "A12";
    String t2_bad = "B345";
    String t3_ok = "UABC";
    String t3_bad = "Uabc";
    System.out.println(check1(t1));
    System.out.println(check2(t2_ok));
    System.out.println(check2(t2_bad));
    System.out.println(check3(t3_ok));
    System.out.println(check3(t3_bad));
  }

  public static boolean check1(String st) {
    if (st.matches(".*")) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean check2(String st) {
    if (st.matches("A[0-9]{1,2}")) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean check3(String st) {
    if (st.matches("U[A-Z]{3}")) {
      return true;
    } else {
      return false;
    }
  }
}
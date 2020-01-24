public class Main {
  public static void main(String[] args) {
    Bank b1 = new Bank();
    b1.name = "testName";
    b1.address = "testAdd";
    Bank b2 = new Bank();
    b2.name = "testName";
    b2.address = "testAdd";
    System.out.println(b1.equals(b2));
  }
}
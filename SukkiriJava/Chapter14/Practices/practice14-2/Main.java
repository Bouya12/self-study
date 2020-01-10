/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // ‡@ Check toString()
    Account a = new Account();
    a.accountNumber = "4649";
    a.balance = 1592;
    System.out.println(a);

    // ‡A Check equals()
    Account b = new Account();
    b.accountNumber = "4649";
    System.out.println(a.equals(b));
    b.accountNumber = " 4649";
    System.out.println(a.equals(b));
  }
}
public class Account {
  String accountNumber;
  int balance;
  public String toString() {
    return "" + balance + "(ŒûÀ”Ô†" + accountNumber + ")";
  }
  public boolean equals(Object o) {
    if (this == o) { return true; }
    if (o instanceof Account) {
      Account a = (Account) o;
      String thisNumber = this.accountNumber.trim();
      String checkNumber = a.accountNumber.trim();
      if (thisNumber.equals(checkNumber)) {
        return true;
      }
    }
    return false;
  }
}
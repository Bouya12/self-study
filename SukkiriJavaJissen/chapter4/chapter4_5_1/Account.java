public class Account implements Comparable<Account> {
  private int nummber;  // ŒûÀ”Ô†

  Account(int number) {
    this.nummber = number;
  }

  public int compareTo(Account obj) {
    if (this.nummber < obj.nummber) {
      return -1;
    } 
    if (this.nummber > obj.nummber) {
      return 1;
    } 
    return 0;
  }

  public int getNummber() {
    return nummber;
  }

  public void setNummber(int nummber) {
    this.nummber = nummber;
  }
}
public class Account {
  private String accountNo;
  private int balance;
  private AccountType accountType;
  public Account(String aNo, AccountType aType) {
    this.accountNo = aNo;
    this.accountType = aType;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
  }
}
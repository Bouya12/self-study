package jp.miyabilink.atm;

/**
 * 口座クラス。
 * このクラスは、1つの銀行口座を表します。
 */
public class Account {
  /** 残高 */
  private int balance;
  /** 口座名義人 */
  private String owner;
  /**
   * 送金を行うメソッド。
   * このメソッドを呼び出すと、<b>他の</b>口座に送金します。
   */
  public void transfer(Account dest, int amount) {
    // :
  }
}
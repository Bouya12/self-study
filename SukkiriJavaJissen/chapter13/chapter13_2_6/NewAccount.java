package jp.miyabilink.atm;

import java.io.Serializable;

/**
 * 新口座クラス。
 * @author 湊
 */
public class NewAccount implements Serializable {
  /** 残高 */
  private int balance;
  /** 口座名義人 */
  private String owner;
  /**
   * 他行への振り込みを行うメソッド。
   * @param bank 送金先銀行
   * @param dest 送金先口座
   * @param amount 送金する金額
   * @return 送金手数料
   * @exception java.lang.IllegalArgumentException 残高不足のとき
   */
  public int transfer(Bank bank, NewAccount dest, int amount) {
    // :
  }
}
package jp.miyabilink.atm;

import java.io.Serializable;

/**
 * �����N���X�B
 * @author ��
 * @deprecated �����NewAccount�N���X�𗘗p���Ă��������B
 * @see NewAccount
 */
public class Account implements Serializable {
  /** �c�� */
  private int balance;
  /** �������`�l */
  private String owner;
  /**
   * ���s�ւ̐U�荞�݂��s�����\�b�h�B
   * @param bank �������s
   * @param dest ���������
   * @param amount ����������z
   * @return �����萔��
   * @exception java.lang.IllegalArgumentException �c���s���̂Ƃ�
   */
  public int transfer(Bank bank, Account dest, int amount) {
    // :
  }
}
package jp.miyabilink.atm;

import java.io.Serializable;

/**
 * �V�����N���X�B
 * @author ��
 */
public class NewAccount implements Serializable {
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
  public int transfer(Bank bank, NewAccount dest, int amount) {
    // :
  }
}
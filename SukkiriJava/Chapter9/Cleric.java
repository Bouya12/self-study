import java.util.Random;

/**
 * Cleric
 */
public class Cleric {

  String name;
  int hp;
  static final int maxHp = 50;
  int mp;
  static final int maxMp = 10;

  void selfAid() {
    System.out.println(this.name + "�̓Z���t�G�C�h���������I");
    this.mp -= 5;
    this.hp = Cleric.maxHp;
    System.out.println("HP���ő�܂ŉ񕜂����B");
  }

  int pray(int sec) {
    System.out.println(this.name + "��" + sec + "�b�ԓV�ɋF�����I");

    // �_����̉񕜗ʂ𗐐���p���Č���
    int recover = new Random().nextInt(3) + sec;

    // ���ۂ̉񕜗ʂ�����
    int recoverActual = Math.min(Cleric.maxMp - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MP��" + recoverActual + "�񕜂����B");
    return recoverActual;
  }

  Cleric (String name, int hp, int mp) {
    this.name = name;
    this.hp = hp;
    this.mp = mp;
  }

  Cleric (String name, int hp) {
    this(name, hp, Cleric.maxMp);
  }

  Cleric (String name) {
    this(name, Cleric.maxHp, Cleric.maxMp);
  }
}
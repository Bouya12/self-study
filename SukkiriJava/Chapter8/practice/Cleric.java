import java.util.Random;

/**
 * Cleric
 */
public class Cleric {

  String name;
  int hp = 50;
  final int maxHp = 50;
  int mp = 10;
  final int maxMp = 10;

  void selfAid() {
    System.out.println(this.name + "�̓Z���t�G�C�h���������I");
    this.mp -= 5;
    this.hp = this.maxHp;
    System.out.println("HP���ő�܂ŉ񕜂����B");
  }

  int pray(int sec) {
    System.out.println(this.name + "��" + sec + "�b�ԓV�ɋF�����I");

    // �_����̉񕜗ʂ𗐐���p���Č���
    int recover = new Random().nextInt(3) + sec;

    // ���ۂ̉񕜗ʂ�����
    int recoverActual = Math.min(this.maxMp - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MP��" + recoverActual + "�񕜂����B");
    return recoverActual;
  }
}
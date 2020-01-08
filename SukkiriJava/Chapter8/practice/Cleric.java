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
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.maxHp;
    System.out.println("HPが最大まで回復した。");
  }

  int pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");

    // 論理上の回復量を乱数を用いて決定
    int recover = new Random().nextInt(3) + sec;

    // 実際の回復量を決定
    int recoverActual = Math.min(this.maxMp - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した。");
    return recoverActual;
  }
}
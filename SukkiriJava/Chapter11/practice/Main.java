public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    PoisonMatango pm = new PoisonMatango('A');
    Matango m = new Matango('B');

    m.attack(h);
    pm.attack(h);
    System.out.println("*勇者の残り体力は" + h.getHp() + "です");
    System.out.println("お化け毒キノコの連続攻撃！");
    for (int i = 0; i < 5; i++) {
      pm.attack(h);
      System.out.println("*勇者の残り体力は" + h.getHp() + "です");
    }
  }
}
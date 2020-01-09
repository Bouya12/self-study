public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    PoisonMatango pm = new PoisonMatango('A');
    Matango m = new Matango('B');

    m.attack(h);
    pm.attack(h);
    System.out.println("*—EÒ‚Ìc‚è‘Ì—Í‚Í" + h.getHp() + "‚Å‚·");
    System.out.println("‚¨‰»‚¯“ÅƒLƒmƒR‚Ì˜A‘±UŒ‚I");
    for (int i = 0; i < 5; i++) {
      pm.attack(h);
      System.out.println("*—EÒ‚Ìc‚è‘Ì—Í‚Í" + h.getHp() + "‚Å‚·");
    }
  }
}
public class Main {
  public static void main(String[] args) {
    Hero h = new Hero();
    PoisonMatango pm = new PoisonMatango('A');
    Matango m = new Matango('B');

    m.attack(h);
    pm.attack(h);
    System.out.println("*�E�҂̎c��̗͂�" + h.getHp() + "�ł�");
    System.out.println("�������ŃL�m�R�̘A���U���I");
    for (int i = 0; i < 5; i++) {
      pm.attack(h);
      System.out.println("*�E�҂̎c��̗͂�" + h.getHp() + "�ł�");
    }
  }
}
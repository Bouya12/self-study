public class PoisonMatango extends Matango {
  private int poisonCount = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("����ɓł̖E�q���΂�܂����I");
      int damage = h.getHp() / 5;
      h.setHp(h.getHp() - damage);
      System.out.println(damage + "�|�C���g�̃_���[�W");
      this.poisonCount--;
    }
  }
}
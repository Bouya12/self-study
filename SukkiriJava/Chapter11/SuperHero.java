public class SuperHero extends Hero {
  private boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("��яオ�����I");
  }
  public void land() {
    this.flying = false;
    System.out.println("���n�����I");
  }

  public void run() {
    System.out.println("�P�ނ���");
  }

  public void attack(Matango m) {
    super.attack(m);
    if (this.flying) {
      super.attack(m);
    }
  }
}
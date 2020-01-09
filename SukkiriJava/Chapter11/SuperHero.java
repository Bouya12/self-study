public class SuperHero extends Hero {
  private boolean flying;
  public void fly() {
    this.flying = true;
    System.out.println("”ò‚Ñã‚ª‚Á‚½I");
  }
  public void land() {
    this.flying = false;
    System.out.println("’…’n‚µ‚½I");
  }

  public void run() {
    System.out.println("“P‘Ş‚µ‚½");
  }

  public void attack(Matango m) {
    super.attack(m);
    if (this.flying) {
      super.attack(m);
    }
  }
}
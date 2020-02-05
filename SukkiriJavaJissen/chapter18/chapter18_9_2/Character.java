public abstract class Character {
  protected String name;
  public final void introduce() {
    System.out.println("éÑÇÃñºëOÇÕ" + this.name + "Ç≈Ç∑ÅB");
    doIntroduce();
    System.out.println("ÇÊÇÎÇµÇ≠Ç®ÇÀÇ™Ç¢ÇµÇ‹Ç∑ÅB");
  }
  protected abstract void doIntroduce();
  public Character(String name) {
    this.name = name;
  }
}
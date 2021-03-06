public abstract class Character {
  protected String name;
  public final void introduce() {
    System.out.println("私の名前は" + this.name + "です。");
    doIntroduce();
    System.out.println("よろしくおねがいします。");
  }
  protected abstract void doIntroduce();
  public Character(String name) {
    this.name = name;
  }
}
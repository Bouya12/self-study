public abstract class Character {
  protected String name;
  public final void introduce() {
    System.out.println("���̖��O��" + this.name + "�ł��B");
    doIntroduce();
    System.out.println("��낵�����˂������܂��B");
  }
  protected abstract void doIntroduce();
  public Character(String name) {
    this.name = name;
  }
}
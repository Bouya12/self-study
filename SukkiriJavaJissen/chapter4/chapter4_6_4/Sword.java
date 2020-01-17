public class Sword implements Cloneable {
  String name;

  public Sword(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Sword [name=" + name + "]";
  }

  @Override
  public Sword clone() {
    Sword result = new Sword(name);
    result.name = this.name;
    return result;
  }
}
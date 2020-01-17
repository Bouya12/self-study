public class Hero implements Cloneable {
  String name;
  Sword sword;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Sword getSword() {
    return sword;
  }

  public void setSword(Sword sword) {
    this.sword = sword;
  }

  public Hero(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Hero [name=" + name + ", sword=" + sword + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((sword == null) ? 0 : sword.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Hero other = (Hero) obj;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    if (sword == null) {
      if (other.sword != null)
        return false;
    } else if (!sword.equals(other.sword))
      return false;
    return true;
  }

  @Override
  public Hero clone() {
    Hero result = new Hero(name);
    result.name = this.name;
    result.sword = this.sword.clone();
    return result;
  }
}
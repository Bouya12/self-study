public class Bank {
  private String name;
  public String getName() {
    return this.name;
  }
  public void setName(String newName) {
    if (newName.length() < 3) {
      throw new IllegalArgumentException("���O���s���ł�");
    }
    this.name = newName;
  }
}

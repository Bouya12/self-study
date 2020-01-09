public class Item {
  private String name;
  private int price;
  public Item(String name) {
    this.name = name;
    this.price = 0;
  }
  public String getName() { return this.name; }
  public Item(String name, int price) {
    this.name = name;
    this.price = price;
  }
}
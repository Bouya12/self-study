public abstract class TangibleAsset extends Asset {
  private final String color;
  public TangibleAsset(final String name, final int price, final String color) {
    super(name, price);
    this.color = color;
  }
  public String getColor() { return this.color; }
}
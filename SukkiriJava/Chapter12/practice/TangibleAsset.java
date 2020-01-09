public abstract class TangibleAsset extends Asset implements Tshing {
  private String color;
  private double weight;
  public TangibleAsset( String name,  int price,  String color) {
    super(name, price);
    this.color = color;
  }
  public String getColor() { return this.color; }
  public String getWeight() { return this.weight; }
  public String setWeight(double weight) { this.weight = weight; }
}
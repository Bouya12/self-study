/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Cleric c1 = new Cleric("アサカ1", 40, 5);
    Cleric c2 = new Cleric("アサカ2", 35);
    Cleric c3 = new Cleric("アサカ3");
    outStatus(c1);
    outStatus(c2);
    outStatus(c3);
  }

  static void outStatus(Cleric c) {
    System.out.println("=============================");
    System.out.println("NAME : " + c.name);
    System.out.println("H  P : " + c.hp);
    System.out.println("M  P : " + c.mp);
    System.out.println("=============================");
  }
}
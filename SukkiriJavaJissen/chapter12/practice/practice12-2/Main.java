import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println("1�~�ȏ�̃A�C�e���ꗗ�\��\�����܂�");
    ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
    for (Item item : items) {
      System.out.printf("%10s%4d%4d",
                        item.getName(), item.getPrice(), item.getWeight());
    }
  }
}
import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<Account> list = new ArrayList<>(); {
      Account a1 = new Account(2345);
      Account a2 = new Account(1234);
      Account a3 = new Account(6789);
      list.add(a1);
      list.add(a2);
      list.add(a3);
      System.out.println("========== ソート前 ==========");
      for (Account a : list) {
        System.out.println(a.getNummber());
      }

      Collections.sort(list);
      System.out.println("========== ソート後 ==========");
      for (Account a : list) {
        System.out.println(a.getNummber());
      }
    }
  }
}
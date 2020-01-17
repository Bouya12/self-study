import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("–©");
    names.add("’©");
    names.add("›Œ´");
    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      String e = it.next();
      System.out.println(e);
    }
  }
}
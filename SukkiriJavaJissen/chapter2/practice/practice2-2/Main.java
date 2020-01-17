import java.time.*;
import java.time.format.*;
public class Main {
  public static void main(String[] args) {
    DateTimeFormatter f = DateTimeFormatter.ofPattern("¼—ïyyyy”NMMŒdd“ú");
    LocalDate d = LocalDate.now();
    d = d.plusDays(100);
    String str = d.format(f);
    System.out.println(str);
  }
}
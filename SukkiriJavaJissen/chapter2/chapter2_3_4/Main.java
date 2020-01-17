import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    // •¶š—ñ‚©‚çLocalDate‚ğ¶¬
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate d = LocalDate.parse("2011/08/21", f);

    // 1000“úŒã‚ğŒvZ‚·‚é
    d = d.plusDays(1000);
    String str = d.format(f);
    System.out.println("1000“úŒã‚Í" + str);

    // Œ»İ“ú•t‚Æ‚Ì”äŠr
    LocalDate now = LocalDate.now();
    if (now.isAfter(d)) {
      System.out.println("now‚Íd‚æ‚èV‚µ‚¢");
    }
  }
}
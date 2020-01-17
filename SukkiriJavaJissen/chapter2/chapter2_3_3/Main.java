import java.time.*;
public class Main {
  public static void main(String[] args) {
    // LocalDateTime‚Ì¶¬•û–@
    LocalDateTime l1 = LocalDateTime.now();
    LocalDateTime l2 = LocalDateTime.of(2014, 1, 1, 9, 5, 0, 0);
    System.out.println(l1);
    System.out.println(l2);

    // LocalDateTime‚ÆZonedDateTime‚Ì‘ŠŒİ•ÏŠ·
    ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
    LocalDateTime l3 = z1.toLocalDateTime();
    System.out.println(z1);
    System.out.println(l3);
  }
}
import java.time.*;
public class Main {
  public static void main(String[] args) {
    // Instantの生成
    Instant i1 = Instant.now();
    System.out.println("Instant.now() : " + i1);

    // Instantとlong値との相互変換
    Instant i2 = Instant.ofEpochMilli(319202291332L);
    long l = i2.toEpochMilli();
    System.out.println("Instant.ofEpochMilli(319202291332L) : " + i2);
    System.out.println("i2.toEpochMilli() : " + l);

    // ZonedDateTimeの生成
    ZonedDateTime z1 = ZonedDateTime.now();
    ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
    System.out.println("ZonedDateTime.now() : " + z1);
    System.out.println("ZonedDateTime.of Tokyo : " + z2);

    // InstantとZondeDateTimeの相互変換
    Instant i3 = z2.toInstant();
    ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
    System.out.println("z2.toInstant() : " + i3);
    System.out.println("i3.atZone London : " + z3);

    // ZoneDateTimeの利用
    System.out.println("東京:" + z2.getYear() + z2.getMonthValue() + z2.getDayOfMonth());
    System.out.println("ロンドン:" + z3.getYear() + z3.getMonthValue() + z3.getDayOfMonth());
    if (z2.isEqual(z3)) {
      System.out.println("これらは同じ瞬間を指しています");
    }
  }
}
import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    LocalDate d1 = LocalDate.of(2012,1,1);
    LocalDate d2 = LocalDate.of(2012,1,5);
    System.out.println(d1);
    System.out.println(d2);

    // 3���Ԃ�\��Period��2�ʂ�̕��@�Ő���
    Period p1 = Period.ofDays(3);
    Period p2 = Period.between(d1,d2);
    System.out.println(p1);
    System.out.println(p2);

    // d2�̂����3������v�Z����
    LocalDate d3 = d2.plus(p2);
    System.out.println(d3);
  }
}
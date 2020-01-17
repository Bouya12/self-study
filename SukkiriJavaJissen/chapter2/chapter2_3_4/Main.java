import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    // �����񂩂�LocalDate�𐶐�
    DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate d = LocalDate.parse("2011/08/21", f);

    // 1000������v�Z����
    d = d.plusDays(1000);
    String str = d.format(f);
    System.out.println("1000�����" + str);

    // ���ݓ��t�Ƃ̔�r
    LocalDate now = LocalDate.now();
    if (now.isAfter(d)) {
      System.out.println("now��d���V����");
    }
  }
}
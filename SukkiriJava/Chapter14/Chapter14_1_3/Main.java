import java.util.Calendar;
import java.util.Date;
public class Main {
  public static void main(String[] args) {
    // ���݂̍΂�\������
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int y = c.get(Calendar.YEAR);
    System.out.println("���N��" + y + "�N�ł�");
    // �w�肵������Date�^�̒l�𓾂�
    c.set(2010, 8, 22, 1, 23, 45);
    c.set(Calendar.YEAR, 2011);
    Date past = c.getTime();
    System.out.println(past);
  }
}
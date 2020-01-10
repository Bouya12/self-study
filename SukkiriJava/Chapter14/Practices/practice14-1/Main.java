import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Main {
  public static void main(String[] args) {
    Date now = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    int day = c.get(Calendar.DAY_OF_MONTH) + 100;
    c.set(Calendar.DAY_OF_MONTH, day);
    Date future = c.getTime();
    SimpleDateFormat f = new SimpleDateFormat("¼—ïyyyy”NMMŒdd“ú");
    System.out.println(f.format(future));
  }
}
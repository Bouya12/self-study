import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
  public static void main(String[] args) throws Exception {
    // –{“ú‚Ì“ú‚ğ•\¦‚·‚é
    Date now = new Date();
    SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
    String s = f.format(now);
    System.out.println(s);
    // w’è“ú‚Ì•¶š—ñ‚ğ‰ğÍ‚µDateŒ^‚Æ‚µ‚Ä“¾‚é
    Date d = f.parse("2011/09/22 01:23:45");
    System.out.println(d);
  }
}
import java.io.*;

public class MyLogger {
  private static MyLogger theInstance;
  FileWriter fw;
  private MyLogger() {
    try {
      this.fw = new FileWriter("dummylog.txt");
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
  public void log(String msg) {
    try {
      this.fw.write(msg);
      fw.flush();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
  public static MyLogger getInstance() {
    if (theInstance == null) {
      theInstance = new MyLogger();
    }
    return theInstance;
  }
}
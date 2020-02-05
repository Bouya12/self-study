import java.util.*;

class PrintingThread extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println("‚È‚É‚©“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
    Thread t = new PrintingThread();
    t.start();
    String text = new Scanner(System.in).nextLine();
    System.out.println(text);
  }
}
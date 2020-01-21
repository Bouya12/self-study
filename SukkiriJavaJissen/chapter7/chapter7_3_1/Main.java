import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("計算を開始します");
    System.out.println("1つ目の数字を入力してください");
    int number1 = new java.util.Scanner(System.in).nextInt();
    System.out.println("2つ目の数字を入力してください");
    int number2 = new java.util.Scanner(System.in).nextInt();
    int answer = number1 + number2;
    System.out.println("入力値の加算結果をメモ帳で表示します");
    String calcreport = "calcreport.txt";
    FileWriter fw = new FileWriter(calcreport);
    fw.write(Integer.toString(number1));
    fw.write('+');
    fw.write(Integer.toString(number2));
    fw.write('=');
    fw.write(Integer.toString(answer));
    fw.close();
    ProcessBuilder pb = new ProcessBuilder(
      "c:\\windows\\system32\\notepad.exe",
      calcreport
    );
    pb.start();
  }
}
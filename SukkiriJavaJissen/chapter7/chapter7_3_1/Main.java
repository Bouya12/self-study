import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("�v�Z���J�n���܂�");
    System.out.println("1�ڂ̐�������͂��Ă�������");
    int number1 = new java.util.Scanner(System.in).nextInt();
    System.out.println("2�ڂ̐�������͂��Ă�������");
    int number2 = new java.util.Scanner(System.in).nextInt();
    int answer = number1 + number2;
    System.out.println("���͒l�̉��Z���ʂ��������ŕ\�����܂�");
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
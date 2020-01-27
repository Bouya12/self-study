import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    // 「総務部」のリーダー「田中太郎（41歳）」のインスタンスを生成
    Employee emp = new Employee();
    emp.name = "田中太郎";
    emp.age = 41;
    Department dep = new Department();
    dep.name = "総務部";
    dep.leader = emp;
    System.out.println("== インスタンス生成 ==");
    System.out.println(dep.toString());

    // 直列化機構を使ってインスタンスを「company.dat」に書き込み
    FileOutputStream fos = new FileOutputStream("company.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(dep);
    oos.flush();
    oos.close();

    // 「company.dat」からインスタンスを復元
    FileInputStream fis = new FileInputStream("company.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Department comoany = (Department) ois.readObject();
    ois.close();
    System.out.println("== インスタンス復元 ==");
    System.out.println(dep.toString());
  }
}
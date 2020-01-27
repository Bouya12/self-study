import java.io.*;

public class Main {
  public static void main(String[] args) {
    Hero hero1 = new Hero("�~�i�g", 75, 18);
    System.out.println("== hero1 ==");
    System.out.println(hero1);

    // 1. �C���X�^���X�̒��񉻂ƕۑ�
    try (FileOutputStream fos = new FileOutputStream("rpgsave.dat");) {
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(hero1);
      oos.flush();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }

    // 2. �t�@�C������C���X�^���X�𕜌�
    try (FileInputStream fis = new FileInputStream("rpgsave.dat");) {
      ObjectInputStream ois = new ObjectInputStream(fis);
      Hero hero2 = (Hero) ois.readObject();
      System.out.println("== hero2 ==");
      System.out.println(hero2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }
}
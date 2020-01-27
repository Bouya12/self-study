import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {

    // �u�������v�̃��[�_�[�u�c�����Y�i41�΁j�v�̃C���X�^���X�𐶐�
    Employee emp = new Employee();
    emp.name = "�c�����Y";
    emp.age = 41;
    Department dep = new Department();
    dep.name = "������";
    dep.leader = emp;
    System.out.println("== �C���X�^���X���� ==");
    System.out.println(dep.toString());

    // ���񉻋@�\���g���ăC���X�^���X���ucompany.dat�v�ɏ�������
    FileOutputStream fos = new FileOutputStream("company.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(dep);
    oos.flush();
    oos.close();

    // �ucompany.dat�v����C���X�^���X�𕜌�
    FileInputStream fis = new FileInputStream("company.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Department comoany = (Department) ois.readObject();
    ois.close();
    System.out.println("== �C���X�^���X���� ==");
    System.out.println(dep.toString());
  }
}
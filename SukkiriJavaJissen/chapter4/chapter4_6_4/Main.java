public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("�~�i�g");
    Sword s = new Sword("�͂��˂̌�");
    h1.setSword(s);
    System.out.println("����:" + h1.getSword().getName());
    System.out.println("clone()�ŕ������܂�");
    Hero h2 = h1.clone();
    System.out.println("�R�s�[���̗E�҂̌��̖��O��ς��܂�");
    h1.getSword().setName("�Ђ̂��̖_");
    System.out.println("�R�s�[���ƃR�s�[��̗E�҂̑�����\�����܂�");
    System.out.println("�R�s�[��:" + h1.getSword().getName()
                        + " / �R�s�[��:" + h2.getSword().getName());
  }
}
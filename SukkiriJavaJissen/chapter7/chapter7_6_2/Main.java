public class Main {
  public static void main(String[] args) {
    // String�Ɋւ�������擾���ĕ\������
    Class<?> info1 = String.class;
    System.out.println(info1.getSimpleName());
    System.out.println(info1.getName());
    System.out.println(info1.getPackage().getName());
    System.out.println(info1.isArray());
    // String�̐e�N���X�̏����擾����
    Class<?> info2 = info1.getSuperclass();
    System.out.println(info2.getName());
    Class<?> info3 = args.getClass();
    System.out.println(info3.isArray());
  }
}
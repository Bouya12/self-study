import java.lang.reflect.*;

public class Launcher {
  public static void main(String[] args) {
    String fqcn = args[0];
    String start = args[1];
    showMemory();
    try {
      Class<?> clazz = Class.forName(fqcn);
      displayAllMethod(clazz);
      if (start.equals("E")) {
        launchExternal(clazz);
      } else if (start.equals("I")) {
        launchInternal(clazz);
      } else {
        System.out.println("�N���d���̎w�肪�s���ł�");
        System.exit(1);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
    showMemory();
    System.exit(0);
  }

  public static void showMemory() {
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    long used = (total - free) / 1024 / 1024;
    System.out.println("���݂̃������g�p�� : " + used + " MB");
  }

  public static void displayAllMethod(Class<?> clazz) {
    Method[] methods = clazz.getDeclaredMethods();
    String className = clazz.getName();
    System.out.println(className + "�������ׂẴ��\�b�h�����ȉ��ɕ\�����܂�");
    for (Method m : methods) {
      System.out.println(m.getName());
    }
  }

  public static void launchExternal(Class<?> clazz) throws Exception {
    ProcessBuilder pb = new ProcessBuilder("java", clazz.getName());
    Process proc = pb.start();
    proc.waitFor();
  }

  public static void launchInternal(Class<?> clazz) throws Exception {
    Method m = clazz.getMethod("main", String[].class);
    String[] args = {};
    m.invoke(null, (Object) args);
  }
}
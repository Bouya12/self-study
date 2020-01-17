public class Main {
  public static void main(String[] args) {
    // 1. PADLOCK
    StrongBox<String> padLock = new StrongBox<>(KeyType.PADLOCK);
    padLock.put("pad");
    System.out.println(padLock.get());
    for (int i = 0; i < 1024; i++) {
      padLock.get();
    }
    System.out.println(padLock.get());

    // 2. BUTTON
    StrongBox<String> BUTTON = new StrongBox<>(KeyType.BUTTON);
    BUTTON.put("button");
    System.out.println(BUTTON.get());
    for (int i = 0; i < 1024; i++) {
      BUTTON.get();
    }
    System.out.println(BUTTON.get());
    for (int i = 0; i < 10000; i++) {
      BUTTON.get();
    }
    System.out.println(BUTTON.get());

    // 3. DIAL
    StrongBox<String> DIAL = new StrongBox<>(KeyType.DIAL);
    DIAL.put("dial");
    System.out.println(DIAL.get());
    for (int i = 0; i < 1024; i++) {
      DIAL.get();
    }
    System.out.println(DIAL.get());
    for (int i = 0; i < 10000; i++) {
      DIAL.get();
    }
    System.out.println(DIAL.get());
    for (int i = 0; i < 30000; i++) {
      DIAL.get();
    }
    System.out.println(DIAL.get());  

    // 4. FINGER
    StrongBox<String> FINGER = new StrongBox<>(KeyType.FINGER);
    FINGER.put("finger");
    System.out.println(FINGER.get());
    for (int i = 0; i < 1024; i++) {
      FINGER.get();
    }
    System.out.println(FINGER.get());
    for (int i = 0; i < 10000; i++) {
      FINGER.get();
    }
    System.out.println(FINGER.get());
    for (int i = 0; i < 30000; i++) {
      FINGER.get();
    }
    System.out.println(FINGER.get());
    for (int i = 0; i < 1000000; i++) {
      FINGER.get();
    }
    System.out.println(FINGER.get());
  }
}
public class Main {
  public static void main(String[] args) {
    StrongBox<String> box = new StrongBox<>();
    box.put("test");
    System.out.println(box.get());
  }
}
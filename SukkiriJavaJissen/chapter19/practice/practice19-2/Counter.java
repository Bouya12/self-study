public class Counter {
  private long count = 0;
  public void add(long i) {
    System.out.println("�����Z���܂�");
    synchronized(this) {
      this.count += i;
    }
  }
  public void mul(long i) {
    System.out.println("�|���Z���܂�");
    synchronized(this) {
      this.count *= i;
    }
  }
}
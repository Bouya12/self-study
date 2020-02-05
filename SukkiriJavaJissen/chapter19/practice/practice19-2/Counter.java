public class Counter {
  private long count = 0;
  public void add(long i) {
    System.out.println("‘«‚µŽZ‚µ‚Ü‚·");
    synchronized(this) {
      this.count += i;
    }
  }
  public void mul(long i) {
    System.out.println("Š|‚¯ŽZ‚µ‚Ü‚·");
    synchronized(this) {
      this.count *= i;
    }
  }
}
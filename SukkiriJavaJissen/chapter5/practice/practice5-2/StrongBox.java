public class StrongBox<E> {
  private E data;
  private KeyType keyType;
  private long count;
  public void put(E d) { this.data = d; }
  public E get() { 
    count++;
    switch (this.keyType) {
      case PADLOCK:
        if (count < 1_024) { return null; }
        break;
      case BUTTON:
        if (count < 10_000) { return null; }
        break;
      case DIAL:
        if (count < 30_000) { return null; }
        break;
      case FINGER:
        if (count < 1_000_000) { return null; }
        break;
    }
    return this.data; 
  }
  public StrongBox(KeyType kType) {
    this.keyType = kType;
  }
}
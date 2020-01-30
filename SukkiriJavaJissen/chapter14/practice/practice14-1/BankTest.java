import static org.junit.Assert.*;

import org.junit.Test;
public class BankTest {
  @Test public void rightSetName() {
    Bank b = new Bank();
    b.setName("minato");
    assertEquals("minato", b.getName());
  }
  @Test public void nullSetName() {
    try {
      Bank b = new Bank();
      b.setName(null);
    } catch(NullPointerException e) {
      // Test OK
      return ;
    }
    fail();
  }
  @Test public void shortSetName() {
    try {
      Bank b = new Bank();
      b.setName("ab");
    } catch(IllegalArgumentException e) {
      // Test OK
      return ;
    }
    fail();
  }
  @Test public void BoundaryValueTestSetName() {
    Bank b = new Bank();
    b.setName("abc");
    assertEquals("abc", b.getName());
  }
}

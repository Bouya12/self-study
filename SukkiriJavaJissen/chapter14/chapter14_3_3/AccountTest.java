import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
  @Test public void instantiate() {
    Account a = new Account("�~�i�g", 30000);
    assertEquals("�~�i�g", a.owner);
    assertEquals(30000, a.balance);
  }
  @Test public void transfer() {
    Account a = new Account("�~�i�g", 30000);
    Account b = new Account("�A�T�J", 50000);
    a.transfer(b, 10000);
    assertEquals(20000, a.balance);
    assertEquals(60000, b.balance);
  }
}

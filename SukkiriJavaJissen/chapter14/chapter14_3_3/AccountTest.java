import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {
  @Test public void instantiate() {
    Account a = new Account("ミナト", 30000);
    assertEquals("ミナト", a.owner);
    assertEquals(30000, a.balance);
  }
  @Test public void transfer() {
    Account a = new Account("ミナト", 30000);
    Account b = new Account("アサカ", 50000);
    a.transfer(b, 10000);
    assertEquals(20000, a.balance);
    assertEquals(60000, b.balance);
  }
}

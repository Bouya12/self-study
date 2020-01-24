import org.apache.commons.lang3.builder.*;
public class Bank {
  String name;
  String address;

  // EqualsBuilder を用いない Bank クラス
  /*
  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Bank)) return false;
    Bank r = (Bank) o;
    if (!this.name.equals(r.name)) return false;
    if (!this.address.equals(r.address)) return false;
    return true;
  }
  */

  // EqualsBuilder を用いた Bank クラス
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }
}
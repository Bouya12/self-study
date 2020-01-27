import java.io.Serializable;

public class Department implements Serializable {
  String name;
  Employee leader;

  @Override
  public String toString() {
    String strEmp = this.leader.toString();
    return "Department [name=" + name + "]" + "\n" + strEmp;
  }
}
import java.io.Serializable;

public class Employee implements Serializable {
  String name;
  int age;

  @Override
  public String toString() {
    return "Employee [age=" + age + ", name=" + name + "]";
  }
}
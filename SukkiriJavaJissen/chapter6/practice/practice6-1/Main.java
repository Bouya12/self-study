public class Main {
  public static void main(String[] args) {
    Func1 func1 = FuncList::isOdd;
    Func2 func2 = FuncList::addNamePrefix;
    // male = 1, female = 2
    // Minato, male
    String member1Name = "Minato";
    int member1Male = 1;
    System.out.println(func2.call2(func1.call1(member1Male), member1Name));

    // Tomoka, female
    String member2Name = "Tomoka";
    int member2Male = 2;
    System.out.println(func2.call2(func1.call1(member2Male), member2Name));
  }
}
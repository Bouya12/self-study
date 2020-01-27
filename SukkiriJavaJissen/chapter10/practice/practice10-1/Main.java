import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Reader fr = new FileReader("pref.properties");
    Properties p = new Properties();
    p.load(fr);
    String aichiCapital = p.getProperty("aichi.capital");
    String aichiFood = p.getProperty("aichi.food");
    System.out.println(aichiCapital + ":" + aichiFood);
  }
}
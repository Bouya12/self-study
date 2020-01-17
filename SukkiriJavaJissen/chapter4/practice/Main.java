import java.util.*;
public class Main {
  public static void main(String[] args) {
    Book b1 = new Book();
    Book b2 = new Book();
    Book b3 = new Book();
    Book b4 = new Book();
    Book b11 = new Book();
    String t1 = "Java";
    String t2 = "Ruby";
    Date p1 = new Date();
    Date p2 = new Date(1316622225935L);
    b1.setTitle(t1);
    b1.setPublishDate(p1);
    b1.setComment("book1");
    b2.setTitle(t2);
    b2.setPublishDate(p1);
    b2.setComment("book2");
    b3.setTitle(t1);
    b3.setPublishDate(p2);
    b3.setComment("book3");
    b4.setTitle(t2);
    b4.setPublishDate(p2);
    b4.setComment("book4");
    b11.setTitle(t1);
    b11.setPublishDate(p1);
    b11.setComment("book11");

    // 等価チェック
    System.out.println("========== 等価チェック ==========");
    isEquals(b1, b2);
    isEquals(b1, b3);
    isEquals(b1, b4);
    isEquals(b1, b11);
    System.out.println();

    // ソートチェック
    System.out.println("========== ソートチェック ==========");
    List<Book> books = new ArrayList<>();
    books.add(b1);
    books.add(b3);
    System.out.println("＊ソート前");
    for (Book b : books) {
      System.out.println("Comment:" + b.getComment() + " Date:" + b.getPublishDate());
    }
    System.out.println("＊ソート後");
    Collections.sort(books);
    for (Book b : books) {
      System.out.println("Comment:" + b.getComment() + " Date:" + b.getPublishDate());
    }
    System.out.println();

    // 複製チェック
    System.out.println("========== 複製チェック ==========");
    Book b1Clone = b1.clone();
    System.out.println(b1);
    System.out.println(b1Clone);
  }

  static void isEquals(Book b1, Book b2) {
    if (b1.equals(b2)) {
      System.out.println(b1.getComment() + " is " + b2.getComment());
    } else {
      System.out.println(b1.getComment() + " is not " + b2.getComment());
    }
  }
}
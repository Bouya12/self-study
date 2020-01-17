import java.util.*;
public class Book implements Comparable<Book>, Cloneable {
  private String title;
  private Date publishDate;
  private String comment;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getPublishDate() {
    return publishDate;
  }

  public void setPublishDate(Date publishDate) {
    this.publishDate = publishDate;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public int hashCode() {
    int result = 37;
    result = result * 31 + title.hashCode();
    result = result * 31 + publishDate.hashCode();
    return result;
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Book)) return false;
    Book b = (Book) o;
    if (!(b.title.equals(this.title) && b.publishDate.equals(this.publishDate))) {
      return false;
    }
    return true;
  }

  public int compareTo(Book o) {
    return this.publishDate.compareTo(o.publishDate);
  }

  public Book clone() {
    Book result = new Book();
    result.comment = this.comment;
    result.publishDate = (Date) this.publishDate.clone();
    result.title = this.title;
    return result;
  }

  public String toString() {
    return "Book [comment=" + comment + ", publishDate=" + publishDate + ", title=" + title + "]";
  }
}
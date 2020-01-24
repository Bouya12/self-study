import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
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
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  public int compareTo(Book o) {
    return CompareToBuilder.reflectionCompare(this, o);
  }

  public Book clone() {
    Book result = new Book();
    result.comment = this.comment;
    result.publishDate = (Date) this.publishDate.clone();
    result.title = this.title;
    return result;
  }

  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }
}
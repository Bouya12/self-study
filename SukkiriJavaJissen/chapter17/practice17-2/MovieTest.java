import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class MovieTest {

  @Test
  public void testConstractorNoneArgs() {
    Movie m = new Movie();
  }

  @Test
  public void testConstractorSetTitle() {
    Movie m = new Movie("SukkiriJava");
  }

  @Test
  public void testTitle() {
    Movie m = new Movie();
    m.setTitle("TestTitle");
    assertEquals("TestTitle", m.getTitle());
  }

  @Test
  public void testDate() {
    Movie m = new Movie();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate releaseDate = LocalDate.parse("2020/01/01", dateFormat);
    m.setReleaseDate(releaseDate);
    assertEquals(releaseDate, m.getReleaseDate());
  }

  @Test(expected=IllegalArgumentException.class)
  public void testDisableSetNullTitle() {
    Movie m = new Movie();
    m.setTitle(null);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testDisableSetNullReleaseDate() {
    Movie m = new Movie();
    m.setReleaseDate(null);
  }

  @Test(expected=IllegalArgumentException.class)
  public void testDisableSetFutureReleaseDate() {
    Movie m = new Movie();
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate releaseDate = LocalDate.parse("2020/04/01", dateFormat);
    m.setReleaseDate(releaseDate);
  }
}

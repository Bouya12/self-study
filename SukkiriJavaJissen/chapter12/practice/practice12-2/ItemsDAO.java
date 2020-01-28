import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ItemsDAO {
  public static ArrayList<Item> findByMinimumPrice(int price) {
    try {
      Class.forName("org.h2.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try (Connection con = DriverManager.getConnection("jdbc:h2:D:/H2/rpgdb"
          , "sukkirijava", null);) {
      try (PreparedStatement pstmt = con.prepareStatement
            ("SELECT * FROM ITEMS WHERE PRICE > ?");) {
        pstmt.setInt(1, price);
        try (ResultSet rs = pstmt.executeQuery();) {
          ArrayList<Item> items = new ArrayList<>();
          while (rs.next()) {
            Item item = new Item();
            item.setName(rs.getString("NAME"));
            item.setPrice(rs.getInt("PRICE"));
            item.setWeight(rs.getInt("WEIGHT"));
            items.add(item);
          }
          return items;
        } catch (Exception e) {
          e.printStackTrace();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }
}
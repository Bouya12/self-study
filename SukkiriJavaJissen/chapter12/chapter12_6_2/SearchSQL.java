import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class SearchSQL {
  public static void main(String[] args) {
    // STEP 0: 事前準備 (JAR配置を含む)
    try {
      Class.forName("org.h2.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    Connection con = null;
    try {
      con = DriverManager.getConnection("jdbc:h2:D:/H2/rpgdb", "sukkirijava", null);

      System.out.println("== 複数行の結果表処理パターン ==");
      PreparedStatement pstmt1 = con.prepareStatement
          ("SELECT * FROM MONSTERS WHERE HP >= ?");
      pstmt1.setInt(1, 10);
      ResultSet rs1 = pstmt1.executeQuery();
      while (rs1.next()) {
        System.out.println(rs1.getString("NAME"));
      }
      rs1.close();
      pstmt1.close();

      System.out.println("== 単一行の結果表処理パターン ==");
      PreparedStatement pstmt2 = con.prepareStatement
          ("SELECT * FROM MONSTERS WHERE NAME = ?");
      String name = "ゴブリン";
      pstmt2.setString(1, name);
      ResultSet rs2 = pstmt2.executeQuery();
      if (rs2.next()) {
        System.out.println(name + "のHPは" + rs2.getInt("HP"));
      } else {
        System.out.println(name + "はDBに存在しません");
      }
      name = "スライム";
      pstmt2.setString(1, name);
      rs2 = pstmt2.executeQuery();
      if (rs2.next()) {
        System.out.println(name + "のHPは" + rs2.getInt("HP"));
      } else {
        System.out.println(name + "はDBに存在しません");
      }
      rs2.close();
      pstmt2.close();

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      // STEP 3: データベース接続の切断
      if (con != null) {
        try {
          con.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

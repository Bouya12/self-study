import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateSQL {
  public static void main(String[] args) {
    // STEP 0: 事前準備 (JAR配置を含む)
    try {
      Class.forName("org.h2.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    Connection con = null;
    try {
      // STEP 1: データベースの接続
      con = DriverManager.getConnection("jdbc:h2:D:/H2/rpgdb", "sukkirijava", null);
      // STEP 2: SQL送信処理
      // STEP 2-1-1: 送信すべきSQLのひな形を準備
      PreparedStatement pstmt = con.prepareStatement
          ("DELETE FROM MONSTERS WHERE HP <= ? OR NAME = ?");
      // STEP 2-1-2: ひな形に値を流し込みSQL文を組み立て送信する
      pstmt.setInt(1, 10);
      pstmt.setString(2, "スライム");
      int r = pstmt.executeUpdate();
      // STEP2-1-3 処理結果を判定する
      if (r != 0) {
        System.out.println(r + "件のモンスターを削除しました。");
      } else {
        System.out.println("該当するモンスターはいませんでした。");
      }
      pstmt.close();
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

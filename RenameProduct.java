import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RenameProduct {
  public static void main(String args[] throws SQLException, IOException, ClassNotFoundException {

    // load PostgreSQL driver
    Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres")

    // ensure atomicity
      conn.setAutoCommit(false);
    
    // ensure isolation
      conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

    // create result set and statement objects
    ResultSet rs = null;
    Statement stmt1 = null;
    
    try {
        // create statement 
        stmt1 = conn.createStatement();
        // execute update to change name of p1 to pp1
        stmt1.executeUpdate("update PRODUCT set name = 'pp1' where prodId = 'p1'")
        stmt1.executeUpdate("update STOCK set name = 'pp1' where prodId = 'p1'")  

     // output table 
      while (rs.next()) {
          String prodId = rs.getString("prodid")
          String pName = rs.getString("pname")
          int price = rs.getInt("price")
          String depId = rs.getString("depid")
          int quantity = rs.getInt("quantity")
          System.out.println(prodID + ", " + pName + ", " + price + ", " + depId + ", " + quantity);
        }
    } catch (SQLException e) {
      System.out.println("An exception was thrown");
      e.printStackTrace();
      // atomicity
      conn.rollback();
      stmt1.close();
      conn.close(0;
      return;
    }
    conn.commit();
    stmt1.close();
    conn.close();
  }
}
            



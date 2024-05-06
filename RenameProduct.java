//the product changes its name to pp1 in Product and Stock
//use UPDATE to 
// UPDATE PRODUCT and STOCK set prodid = pp1 where prodid = 'p1'
// UPDATE product 
// SET prodid = 'pp1'
//WHERE prodid = 'p1'

// Load the PostgreSQL driver
package renameProduct;
public class RenameProduct {
  public static void main(String args[] throws SQLException, IOException, ClassNotFoundException {

    // load PostgreSQL driver
    Connection conn = DriverManager.getConnection("jdbc:postgresql

    // ensure atomicity
      conn.setAutoCommit(false);
    // ensure isolation
      conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);

    // prepared statement
    public void updateProduct(
    String updateProduct = "update PRODUCT " + "set PRODID = ? where PRODID = ?";
    String updateStock = "update STOCK " + "set PRODID = ? where PRODID = ?";
      PreparedStatement updateP1 = con.prepareStatement(updateProduct);
      PreapredStatement updateP2 = con.prepareStatement(updateStock);
    // change PRODID column of p1 to pp1 for updateP1
    updateP1.setString(1 , "pp1");
    updateP1.setString(1, "p1");
    updateP1.executeUpdate();

    // change PRODID column in Stock(updatep2)
    updateP2.setString(1, "pp1");
    updateP2.setString(1, "p1");
    updateP2.executeUpdate();
    

    // create result set and statement objects
    ResultSet rs = null;
    Statement stmt1 = null;
    try {
        // create statement 
        stmt1 = conn.createStatement();
        // execute update to change name of p1 to pp1
        stmt1.executeUpdate("update PRODUCT set name = 'pp1' where prodid = 'p1")
        stmt1.executeUpdate("update STOCK set name = 'pp1' where prodid = 'p1")  

     // output table (prodid pname, price for Product, prodid. depid, quantity for Stock
      while (rs.next()) {
          String prodId = rs.getString("prodid")
          String pName = rs.getString("pname")
          int price = rs.getInt("price")
          String depId = rs.getString("depid")
          int quantity = rs.getInt("quantity")
          System.out.println(prodID + ", " + pName + ", " + price + ", " + depId + ", " + quantity);
        }
    } catch (SQLException e) {
      e.printStackTrace();
      conn.rollback();
      stmt1.close();
      conn.close(0;
      return;
    }
    conn.commit();
    stmt1.close();
    conn.close();
            

// 1. load drivers
// 2. create a connection
// 3. create a statement(create table, select...)
  stmt1 = conn.createStatement();
  stmt1.executeUpdate(
// 4. Execute statement
// 5. Process the result

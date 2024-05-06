//the product changes its name to pp1 in Product and Stock
//use UPDATE to 
// UPDATE PRODUCT and STOCK set prodid = pp1 where prodid = 'p1'
// UPDATE product 
// SET prodid = 'pp1'
//WHERE prodid = 'p1'

// Load the PostgreSQL driver
public class RenameProduct {
  public static void main(String args[] throws SQLException, IOException, ClassNotFoundException {

    // load PostgreSQL driver
    Connection conn = DriverManager.getConnection

    // ensure atomicity
      conn.setAutoCommit(false);
    // ensure isolation
      conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
    Statement stmt1 = null;
    try {
        // create statement 
        stmt1 = conn.createStatement();
        // execute update to change name of p1 to pp1
        stmt1.executeUpdate("update prodid set name = 'pp1' where prodid = 'p1"

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
            

// 1. load drivers
// 2. create a connection
// 3. create a statement(create table, select...)
  stmt1 = conn.createStatement();
  stmt1.executeUpdate(
// 4. Execute statement
// 5. Process the result

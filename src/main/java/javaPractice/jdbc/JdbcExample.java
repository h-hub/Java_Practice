package javaPractice.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/cms_crud?useSSL=false";

    static final String USER = "root";
    static final String PASS = "admin1234";

    public static void main(String[] args) {

	Connection conn = null;
	Statement stmt = null;
	
	try{

	      Class.forName("com.mysql.jdbc.Driver");

	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      stmt = conn.createStatement();
	      String sql = "SELECT ID, FIRST_NAME, LAST_NAME, EMAIL FROM USER";
	      
	      ResultSet rs = stmt.executeQuery(sql);

	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("ID");
	         String first = rs.getString("FIRST_NAME");
	         String last = rs.getString("LAST_NAME");
	         String email = rs.getString("EMAIL");

	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", First: " + first);
	         System.out.print(", Last: " + last);
	         System.out.println(", Email: " + email);
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException | ClassNotFoundException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }

    }

}

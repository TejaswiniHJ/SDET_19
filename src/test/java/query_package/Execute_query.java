package query_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;


public class Execute_query {
public static void main(String[] args) throws SQLException {
	//Step1: register database
	Driver driverref=new Driver();
	DriverManager.registerDriver(driverref);
	
	//Step2: Establish connection with database
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
	
	//Step3: Issue create statement
	  Statement stat = con.createStatement();
	  
	  //Step 4: Execute any query
	  ResultSet result = stat.executeQuery("select * from customer;");
	  
	  while(result.next())
	  {
	   System.out.println(result.getString(3)+"\t"+result.getString(2));
	  }
	  
	//Step 5:Close database connection
	  con.close();
	 }

	
	
}


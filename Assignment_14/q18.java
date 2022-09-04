package Assignment_14;

// Q.18. Write a program to generate SQLException

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class q18 {


		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String dburl = "jdbc:mysql://localhost/STOREDB";
		static final String dbuser = "root";
		static final String dbpass = "root";

		public static void main(String[] args) throws SQLException {
			Connection con = null;
			Statement stmt = null;

				//Step 1 : Connecting to server and database
				con = DriverManager.getConnection(dburl, dbuser, dbpass);
				//Step 2 : Initialize Statement
				stmt=con.createStatement();
				//Step 3 : SQL Query
				String query="SELECT * FROM ITEM";

				//Step 4 : Run Query In ResultSet
				ResultSet rset = stmt.executeQuery(query);

				while(rset.next())
				{
					System.out.print("ID: " + rset.getInt(1));
					System.out.print(" Product : "+rset.getString(2));
					System.out.println(" Price : "+rset.getString(3));
				}
		}

		// this will show SQLException

}



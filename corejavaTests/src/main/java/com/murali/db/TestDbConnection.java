package com.murali.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbConnection {

	static String url = "jdbc:postgresql://localhost:5432";
	static String username = "postgres";
	static String password = "password";
	static String dbname = "postgres";
	
	public static Connection getConnection() {
		Connection connection = null;		
			try {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url+"/"+dbname+"?user="+username+"&password="+password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		return connection;
	}
	public static void main(String[] args) throws ClassNotFoundException {		    		    		   
		    try {
		    	Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection(url+"/"+dbname+"?user="+username+"&password="+password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from devteam");
				while(rs.next()) {
					System.out.println(rs.getString(2));
				}				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    

	}

}

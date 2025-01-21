package com.murali.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbConnection {

	public static void main(String[] args) throws ClassNotFoundException {
		    String url = "jdbc:postgresql://localhost:5432";
		    String username = "postgres";
		    String password = "password";
		    String dbname = "postgres";
		    
		    
		    try {
		    	Class.forName("org.postgresql.Driver");
				Connection con = DriverManager.getConnection(url+"/"+dbname+"?user="+username+"&password="+password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from devteam");
				while(rs.next()) {
					System.out.println(rs.getString(2));
				}
				
				System.out.println("sdf");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    

	}

}

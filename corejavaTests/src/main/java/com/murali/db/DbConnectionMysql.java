package com.murali.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectionMysql {


	static String url = "jdbc:mysql://localhost:3306";
	static String username = "root";
	static String password = "admin123";
	static String dbname = "mysql";  //you can change db name / schema name
	
	public static Connection getConnection() {
		Connection connection = null;		
			try {
				Class.forName("org.mysql.jdbc.Driver");
				connection = DriverManager.getConnection(url+"/"+dbname+"?user="+username+"&password="+password);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}					
		return connection;
	}
	public static void main(String[] args) throws ClassNotFoundException {		    		    		   
		    try {
		    	Connection con = DriverManager.getConnection(url+"/"+dbname+"?user="+username+"&password="+password);
				Statement st = con.createStatement();
				PreparedStatement st1 = con.prepareStatement("select * from employee where name =?");
				st1.setString(1, "murali");
				ResultSet rs = st1.executeQuery();
				//ResultSet rs = st.executeQuery("select * from employee");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"--"+rs.getString(2)+"--"+rs.getInt(3));
				}				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    

	}

}

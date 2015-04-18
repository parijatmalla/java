package cs520.module5.L2_databases;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P05_MySQLMetaDataDemo {
	
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	private static String DB_URL = "jdbc:mysql://localhost:3306/test";
	private static String DB_USERNAME = "root";
	private static String DB_PASSWORD = "";
	
	public static void main(String[] args) {
	
		try {
			Class.forName(JDBC_DRIVER);
			
			Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);			
			Statement stmt = con.createStatement();
			
			String sql = "Select * from STUDENTS";
			ResultSet rs = stmt.executeQuery(sql);
			ResultSetMetaData md = rs.getMetaData();
			
			int numColumns = md.getColumnCount();
			System.out.println("# Columns = " + numColumns);
			System.out.printf(" %-6s %-20s %-10s %4s\n",
					"Name", "Class", "Type", "Size");
					
			for (int i = 1; i <= numColumns; i++) {
				System.out.printf(" %-6s %-20s %-10s %3d\n",
						md.getColumnName(i),
						md.getColumnClassName(i),
						md.getColumnTypeName(i),
						md.getColumnDisplaySize(i)
						);
			}
			
			stmt.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

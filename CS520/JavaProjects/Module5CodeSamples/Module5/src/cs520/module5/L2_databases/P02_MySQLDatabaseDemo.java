package cs520.module5.L2_databases;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P02_MySQLDatabaseDemo {
	
	private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	private static String DB_URL = "jdbc:mysql://localhost:3306/test";
	private static String DB_USERNAME = "root";
	private static String DB_PASSWORD = "";
	
	public static void main(String[] args) {
	
		try {
			Class.forName(JDBC_DRIVER);
			
			Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);			
			Statement stmt = con.createStatement();
			
			String sqlDropStatement = "DROP TABLE STUDENTS";
			try {
				stmt.executeUpdate(sqlDropStatement);
			}
			catch (Exception e1)
			{
				System.out.println("Trying to drop Students Table...");
			}
			
			String sqlCreateStatement = "CREATE TABLE STUDENTS " +
				"(ID integer auto_increment primary key," +
				"USER varchar(16)," +
				"COURSE varchar(32))";

			stmt.executeUpdate(sqlCreateStatement);
			
			String sql = "insert into STUDENTS (USER,COURSE) values ('Suresh', 'CS520')";
			stmt.executeUpdate(sql);
			sql = "insert into STUDENTS (USER,COURSE) values ('Suresh', 'CS701')";
			stmt.executeUpdate(sql);
			sql = "insert into STUDENTS (USER,COURSE) values ('John', 'CS520')";
			stmt.executeUpdate(sql);
			sql = "insert into STUDENTS (USER,COURSE) values ('John', 'CS701')";
			stmt.executeUpdate(sql);
		
			sql = "Select * from STUDENTS";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next())
			{
				System.out.printf("ID=%2d, USER=%8s, COURSE=%8s\n",
						rs.getInt("ID"),
						rs.getString("USER"),
						rs.getString("COURSE") );
			}
			stmt.close();
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

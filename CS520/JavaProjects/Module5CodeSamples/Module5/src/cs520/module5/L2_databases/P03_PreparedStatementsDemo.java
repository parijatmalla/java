package cs520.module5.L2_databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P03_PreparedStatementsDemo {

	private static String JDBC_DRIVER = "sun.jdbc.odbc.JdbcOdbcDriver";
	
	private static String DB_URL = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=CS520.mdb";
	private static String DB_USERNAME = "";
	private static String DB_PASSWORD = "";
	
	private static void insertData(Connection con)
	{
		String sql = "insert into STUDENTS (USER,COURSE) values (?, ?)";
		String[] courses 	= {"dbms", "security"};
		String[] users 		= {"suresh", "john"};
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			for (int i = 0; i < users.length; i++)
			{
				for (int j = 0; j < courses.length; j++)
				{
					stmt.setString(1, users[i]);
					stmt.setString(2, courses[j]);
					stmt.executeUpdate();
				}
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void retrieveData(Connection con, String user)
	{
		String sql = "select ID, COURSE from STUDENTS where user = ?";
		System.out.println("Courses for " + user);
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, user);
			ResultSet rs = stmt.executeQuery();
			while (rs.next())
			{
				System.out.println("  ID = " + rs.getInt(1) + 
						" : Course = " + rs.getString(2));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
	
		try {
			Class.forName(JDBC_DRIVER);
			
			Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);			
			insertData(con);
			retrieveData(con, "Suresh");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}

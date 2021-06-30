package kr.hs.dgsw.java.c1.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {
	public Connection con;
	public DbConnection() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mariadb://211.53.209.159/dgsw_java",
					"dgsw_student",
					"1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void DbDisconnect() throws SQLException {
		con.close();
	}
	
	public PreparedStatement sqlPrepare(String sql) throws SQLException {
		return con.prepareStatement(sql);
	}
	
	
}

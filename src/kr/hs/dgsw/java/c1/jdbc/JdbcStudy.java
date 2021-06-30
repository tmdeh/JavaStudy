package kr.hs.dgsw.java.c1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcStudy{
	
	public static void main(String[] args) {
		try {
			// 데이터베이스에 접속한다.
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://211.53.209.159/dgsw_java",
					"dgsw_student",
					"1234");
			
			//데이터를 읽어 온다.
			String sql = "SELECT * FROM phone_book where name = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1,"윤석현");
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String name = rs.getString("name");
				String phoneNumber = rs.getString("phone_number");
				String address = rs.getString("address");
				int id = rs.getInt("id");
				
				System.out.println(id + " : " + phoneNumber + " : " + address + " : " + name);
			}
			

			
			//데이터베이스와 접속을 끊는다.
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
	

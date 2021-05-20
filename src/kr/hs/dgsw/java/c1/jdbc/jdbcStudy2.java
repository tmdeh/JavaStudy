package kr.hs.dgsw.java.c1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbcStudy2 {
	
	public static void register(String name, String phoneNumber, String address) {
		try {
			//접속
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mariadb://211.53.209.159/dgsw_java",
					"dgsw_student",
					"1234");
			
			
			//데이터쓰기
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO phone_book ");
			sql.append(" (name, phone_number, address) ");
			sql.append("values ");
			sql.append(" (?, ?, ?) ");
			
			PreparedStatement pstmt  = con.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			
			pstmt.executeUpdate(); //내용을 추가하거나 삭제하거나 업데이트시에 executeQuery 대신에 사용
			
			//접속 종료
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		String phoneNumber = scan.next();
		String address = scan.next();
		
		register(name, phoneNumber, address);
		
		scan.close(); 
	}
}

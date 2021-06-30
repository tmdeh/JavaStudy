package kr.hs.dgsw.java.c1.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DbPhoneBook implements PhoneBook{
	
	@Override
	public List<NameCard> getList() {
		// TODO Auto-generated method stub
		try {
			List<NameCard> cards = new ArrayList<NameCard>();
			String sql = "SELECT * FROM phone_book";
			DbConnection con = new DbConnection();
			
			PreparedStatement pstmt = con.sqlPrepare(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				NameCard card = new NameCard();
				String name = rs.getString("name");
				String phoneNumber = rs.getString("phone_number");
				String address = rs.getString("address");
				int id = rs.getInt("id");
				
				card.setId(id);
				card.setName(name);
				card.setPhoneNumber(phoneNumber);
				card.setAddress(address);
				
				cards.add(card);
			}
			pstmt.close();
			rs.close();
			con.DbDisconnect();
			return cards;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public NameCard getCard(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "SELECT * FROM phone_book where id = ?";
			DbConnection con = new DbConnection();
			PreparedStatement pstmt = con.sqlPrepare(sql);
			pstmt.setInt(1,id);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			NameCard card = new NameCard();
			String name = rs.getString("name");
			String phoneNumber = rs.getString("phone_number");
			String address = rs.getString("address");
			
			card.setId(id);
			card.setName(name);
			card.setPhoneNumber(phoneNumber);
			card.setAddress(address);
			
			rs.close();
			pstmt.close();
			con.DbDisconnect();
			return card;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public NameCard getCard(String name) {
		// TODO Auto-generated method stub
		try {
			
			String sql = "SELECT * FROM phone_book where name = ?";
			DbConnection con = new DbConnection();
			
			PreparedStatement pstmt = con.sqlPrepare(sql);
			pstmt.setString(1,name);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			NameCard card = new NameCard();
			
			String phoneNumber = rs.getString("phone_number");
			String address = rs.getString("address");
			int id = rs.getInt("id");
			
			card.setId(id);
			card.setName(name);
			card.setPhoneNumber(phoneNumber);
			card.setAddress(address);
			
			con.DbDisconnect();
			rs.close();
			pstmt.close();
			return card;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public int addCard(String name, String phoneNumber, String address) {
		// TODO Auto-generated method stub
		try {
			String sql = "INSERT INTO phone_book (name, phone_number, address) VALUE(?, ?, ?)";
			DbConnection con = new DbConnection();
			PreparedStatement pstmt = con.sqlPrepare(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			int rs = pstmt.executeUpdate();
			pstmt.close();
			con.DbDisconnect();
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public boolean removeCard(int id) {
		// TODO Auto-generated method stub
		try {
			String sql = "delete FROM phone_book where id = ?";
			DbConnection con = new DbConnection();
			PreparedStatement pstmt = con.sqlPrepare(sql);
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			pstmt.close();
			con.DbDisconnect();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public void updateCard(int id, String name, String phoneNumber, String address) {
		try {
			
			String sql = "UPDATE phone_book set name = ?, phone_number = ?, address = ? where id = ?";
			DbConnection con = new DbConnection();
			PreparedStatement pstmt = con.sqlPrepare(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setInt(4, id);
			pstmt.executeUpdate();
			
			pstmt.close();
			con.DbDisconnect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public int size() {
		try {
			
			String sql = "SELECT count(*) FROM phone_book";
			DbConnection con = new DbConnection();
			PreparedStatement pstmt = con.sqlPrepare(sql);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int size = rs.getInt("COUNT(*)");
			
			pstmt.close();
			rs.close();
			con.DbDisconnect();
			return size;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}

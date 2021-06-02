package kr.hs.dgsw.java.c1.exam2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

public class FilePhoneBook implements PhoneBook {

	public static final String FILE_NAME = "phoneBook.dat";
	
	private File file;
	private int id;
	
	public FilePhoneBook() {
		file = new File(FILE_NAME);
	}
	
	@Override
	public List<NameCard> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NameCard getCard(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NameCard getCard(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addCard(String name, String phoneNumber, String address) {
		// TODO Auto-generated method stub
		NameCard card = new NameCard();
		
		card.setName(name);
		card.setAddress(address);
		card.setId(id);
		id++;
		card.setPhoneNumber(phoneNumber);
		String str = card.toString();
		
		//BufferedWriter writer = new BufferedWriter(file);		
		return 0;
	}

	@Override
	public boolean removeCard(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateCard(int id, String name, String phoneNumber, String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}

package kr.hs.dgsw.java.c1.utill;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Contacts {

	private Map<String, NameCard> map = 
			new HashMap<String, NameCard>();
	

	public NameCard read(String name) { //
		return map.get(name);
	}
	
	public void save(String name, String phone) { //1 e
		NameCard card = new NameCard();
		card.setName(name);
		card.setPhone(phone);
		
		save(card);
	}

	public void save(NameCard card) {	//2 e
		map.put(card.getName(), card);
	}

	public NameCard readByPhone(String phone) { //e
		Collection<NameCard> list =
				map.values();
		
		for (NameCard card : list) {
			if (card.getPhone().equals(phone)) {
				return card;
			}
		}
		
		return null;
	}
	
	public int getSize() { //e
		return map.size();
	}
	
	public void printAll() {
		Collection<NameCard> list =
				map.values();
		
		for (NameCard card : list) {
			System.out.println(card.getName() + " - " + card.getPhone());
		}
	}
	public static void main(String[] args) {
		Contacts con = new Contacts();
		con.save("유승도","01093423216" );
		con.save("test", "01000000000");
		
		con.printAll();
		
		System.out.println(con.getSize());
		
		NameCard testPhone= con.readByPhone("01093423216");
		
		System.out.println(testPhone.getName() + "-" + testPhone.getPhone());
		
		NameCard testName = con.read("test");
		
		System.out.println(testName.getName() + "-" + testName.getPhone());
		
	}
	
}
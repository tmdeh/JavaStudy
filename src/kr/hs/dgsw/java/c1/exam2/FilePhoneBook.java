package kr.hs.dgsw.java.c1.exam2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class FilePhoneBook implements PhoneBook {

	public static final String FILE_NAME = "/Users/yuseungdo/Documents/study/java/JavaStudy/src/phoneBook.dat";
	
	private File file;
	private int id;
	
	public FilePhoneBook() {
		file = new File(FILE_NAME);
	}
	
	@Override
	public List<NameCard> getList() {
		// TODO Auto-generated method stub
			BufferedReader reader;
			List<NameCard> cards = new ArrayList<NameCard>();
			try {
				reader = new BufferedReader(new FileReader(file));
				JSONParser jsonParser = new JSONParser();
				String line = null;
				while((line=reader.readLine()) != null) {
					JSONObject jsonobj = (JSONObject) jsonParser.parse(line);
					
					String name = (String) jsonobj.get("name");
					String stringId = (String) jsonobj.get("id").toString();
					int id = Integer.parseInt(stringId);
					NameCard card = new NameCard();
					String phoneNumber = (String) jsonobj.get("phoneNumber");
					String address = (String) jsonobj.get("address");
					
					card.setId(id);
					card.setName(name);
					card.setPhoneNumber(phoneNumber);
					card.setAddress(address);
					
					cards.add(card);
				}
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return cards;
	}

	@Override
	public NameCard getCard(int id) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			JSONParser jsonParser = new JSONParser();
			String line = null;
			while((line=reader.readLine()) != null) {
				JSONObject obj = (JSONObject) jsonParser.parse(line);
				String stringId = (String) obj.get("id").toString();
				int cardid = Integer.parseInt(stringId);
				if (id == cardid) {
					NameCard card = new NameCard();
					String name = (String) obj.get("name");
					String phoneNumber = (String) obj.get("phoneNumber");
					String address = (String) obj.get("address");
					
					card.setId(id);
					card.setName(name);
					card.setPhoneNumber(phoneNumber);
					card.setAddress(address);
					
					return card;
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public NameCard getCard(String name) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			JSONParser jsonParser = new JSONParser();

			String line = null;
			while((line=reader.readLine()) != null) {
				JSONObject obj = (JSONObject) jsonParser.parse(line);
				String cardname = (String) obj.get("name");
				if (cardname.equals(name)) {
					String stringId = (String) obj.get("id").toString();
					int id = Integer.parseInt(stringId);
					NameCard card = new NameCard();
					String phoneNumber = (String) obj.get("phoneNumber");
					String address = (String) obj.get("address");
					
					card.setId(id);
					card.setName(cardname);
					card.setPhoneNumber(phoneNumber);
					card.setAddress(address);
					
					return card;
				}
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int addCard(String name, String phoneNumber, String address) {
		// TODO Auto-generated method stub
		NameCard card = new NameCard();
		
		card.setId(id);
		id++;
		card.setName(name);
		card.setAddress(address);
		card.setPhoneNumber(phoneNumber);
		String str = card.toString();
		str = str.replaceAll("}", "'}\n");//json ???????????? ??????
		str = str.replaceAll("'","\"");
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(str);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		return 0;
	}

	@Override
	public boolean removeCard(int id) {
		// TODO Auto-generated method stub
		//1. ?????? ????????? list??? ????????????
		//2. ?????? id??? ?????? ?????? ?????? ???  list??? ?????? ??????
		//3. list??? ????????? ?????? ???
		List<NameCard> cards = new ArrayList<NameCard>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			JSONParser jsonParser = new JSONParser();
			
			String line = null;
			while((line=reader.readLine()) != null) {
				NameCard card = new NameCard();
				JSONObject obj = (JSONObject) jsonParser.parse(line);
				String stringId = (String) obj.get("id").toString();
				int cardId = Integer.parseInt(stringId);
				if(cardId == id) {
					continue;
				}
				String cardname = (String) obj.get("name");
				String phoneNumber = (String) obj.get("phoneNumber");
				String address = (String) obj.get("address");
				
				card.setId(cardId);
				card.setName(cardname);
				card.setPhoneNumber(phoneNumber);
				card.setAddress(address);
				
				cards.add(card);
				
			}
			reader.close();
			file.delete();
			FileWriter fw = new FileWriter(file, true);
			for(NameCard card : cards) {
				String str = card.toString();
				str = str.replaceAll("}", "'}\n");//json ???????????? ??????
				str = str.replaceAll("'","\"");
				fw.write(str);
			}
			fw.close();
			return true;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void updateCard(int id, String name, String phoneNumber, String address) {
		// TODO Auto-generated method stub
		//1. ?????? ????????? list??? ????????????
		//2. ?????? id??? ?????? ?????? ?????? ???  ????????? ????????? list??? ??????
		//3. list??? ????????? ?????? ??????
		List<NameCard> cards = new ArrayList<NameCard>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(file));
			JSONParser jsonParser = new JSONParser();
			
			String line = null;
			while((line=reader.readLine()) != null) {
				NameCard card = new NameCard();
				JSONObject obj = (JSONObject) jsonParser.parse(line);
				String stringId = (String) obj.get("id").toString();
				int cardId = Integer.parseInt(stringId);
				if(cardId == id) {
					card.setId(id);
					card.setName(name);
					card.setPhoneNumber(phoneNumber);
					card.setAddress(address);
				}
				else
				{
					String cardName = (String) obj.get("name");
					String cardPhoneNumber = (String) obj.get("phoneNumber");
					String cardAddress = (String) obj.get("address");
					
					card.setId(cardId);
					card.setName(cardName);
					card.setPhoneNumber(cardPhoneNumber);
					card.setAddress(cardAddress);
				}
				cards.add(card);
			}
			reader.close();
			file.delete();
			FileWriter fw = new FileWriter(file, true);
			for(NameCard card : cards) {
				String str = card.toString();
				str = str.replaceAll("}", "'}\n");//json ???????????? ??????
				str = str.replaceAll("'","\"");
				fw.write(str);
			}
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			int count = 0;
			while((line=reader.readLine()) != null) {
				count++;
			}
			reader.close();
			return count;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}

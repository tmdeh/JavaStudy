package kr.hs.dgsw.java.c1.exam2;

import java.util.List;
import java.util.Scanner;

public class PhoneBookMain {
	public static void main(String[] args) {
		
		PhoneBook phoneBook = new DbPhoneBook();
		NameCard nameCard = null;
		Scanner scan = new Scanner(System.in);
		int select;
		int cardId;
		List<NameCard> cards = phoneBook.getList();
		while(true) {
			System.out.println("------------------------명령을 선택하세요--------------------------");
			System.out.println("----1. 추가 | 2. 삭제 | 3. 수정 | 4. 전체 출력 | 5. 검색 | 6. 종료----");
			System.out.println("--------------------------------------------------------------");
			System.out.print(">>>  ");
			select = scan.nextInt();
			
			switch (select) {
			case 1: //추가
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("휴대전화 번호 : ");
				String phoneNumber = scan.next();
				System.out.print("주소 : ");
				String address = scan.next();
				
				int rs = phoneBook.addCard(name, phoneNumber, address);
				if(rs == 1) {
					System.out.println("추가에 성곡하였습니다.");
					break;
				}
				System.out.println("추가를 실패하였습니다.");
				break;
				
			case 2: //삭제
				System.out.print("삭제할 카드의 번호 : ");
				cardId = scan.nextInt();
				boolean result = phoneBook.removeCard(cards.get(cardId).getId());		
				if(!result) {
					System.out.println("삭제를 실패하였습니다.");
					break;
				}
				System.out.println("삭제에 성공했습니다.");
				break;
				
			case 3: //수정
				System.out.print("수정할 카드의 번호 : ");
				cardId = scan.nextInt();
				System.out.print("새로운 사용자 이름 : ");
				String newName = scan.next();
				System.out.print("새로운 전화번호 : ");
				String newPhoneNumber = scan.next();
				System.out.print("새로운 주소 : ");
				String newAddress = scan.next();
				
				phoneBook.updateCard(cards.get(cardId).getId(), newName, newPhoneNumber, newAddress);
				System.out.println("변경되었습니다.");
				nameCard = phoneBook.getCard(cards.get(cardId).getId());
				System.out.println(nameCard.toString());
				break;
			case 4: //전체 출력
				for (NameCard card : cards) {
					System.out.println(card.toString());
				}
				break;
			case 5: //검색
				System.out.print("검색할 카드의 번호 : ");
				cardId = scan.nextInt();
				nameCard = phoneBook.getCard(cards.get(cardId).getName());
				System.out.println(nameCard.toString());
				break;
			case 6: //종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("명령 번호를 다시 입력해주세요.");
				break;
			}
		}
	}
}

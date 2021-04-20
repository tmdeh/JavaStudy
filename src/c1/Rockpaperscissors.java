package c1;

import java.util.Random;
import java.util.Scanner;
//0: 바위 1: 가위 2: 보
public class Rockpaperscissors {
	Random random =  new Random();
	Scanner scan = new Scanner(System.in);
	int computer = random.nextInt(3);
	public Rockpaperscissors() {
		
	}
	
	public String input() {
		String uinput = scan.next();
		return uinput;
	}
	
	public void win(String user) {
		switch(user) {
		case "가위":
			System.out.println(computer);
			if(computer == 0) {
				System.out.println("컴퓨터 승");
			}
			else if (computer == 1) {
				System.out.println("무승부");
			}
			else if(computer == 2) {
				System.out.println("유저 승");
			}
			break;
		case"바위":
			System.out.println(computer);
			if(computer == 0) {
				System.out.println("무승부");
			}
			else if (computer == 1) {
				System.out.println("유저 승");
			}
			else if(computer == 2) {
				
				System.out.println("컴퓨터 승");
			}
			break;
		case"보":
			System.out.println(computer);
			if(computer == 0) {
				System.out.println("유저 승");
			}
			else if (computer == 1) {
				System.out.println("컴퓨터 승");
			}
			else if(computer == 2) {
				System.out.println("무승부");
			}
			break;
		default:
			System.out.println("오류");
		}
	}
	
	public static void main(String[] args) {
		Rockpaperscissors rps = new Rockpaperscissors();
		String user = rps.input();
		rps.win(user);
	}
}

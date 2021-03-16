package kr.hs.dgsw.java.c1;
import java.util.Scanner;
public class Input {
	Scanner scan = new Scanner(System.in);
	private int value;
	
	public int inIt() {
		System.out.println("정수를 입력하세요");
		value = scan.nextInt();
		return value;
	}
}

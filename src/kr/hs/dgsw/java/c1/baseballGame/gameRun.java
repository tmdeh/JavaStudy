package kr.hs.dgsw.java.c1.baseballGame;

import java.util.Scanner;

public class gameRun {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		baseballGame game = new baseballGame();
		int[] answer = new int[3];
		boolean result = false;
		
		game.randomSet();
		while(true) {
			if(result == true)
				break;
			System.out.println("���ڸ� ���� ������. (1~9 ���� �Է����ּ���)");
			
			System.out.print("ù���� ���� >>  ");
			answer[0] = input.nextInt();
			
			System.out.print("�ι��� ���� >>  ");
			answer[1] = input.nextInt();
			
			System.out.print("������ ���� >>  ");
			answer[2] = input.nextInt();
			
			result = game.check(answer);
		}
		
	}
}

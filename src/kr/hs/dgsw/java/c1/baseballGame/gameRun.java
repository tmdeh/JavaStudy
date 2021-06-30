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
			System.out.println("숫자를 맞춰 보세요. (1~9 까지 입력해주세요)");
			
			System.out.print("첫번쨰 숫자 >>  ");
			answer[0] = input.nextInt();
			
			System.out.print("두번쨰 숫자 >>  ");
			answer[1] = input.nextInt();
			
			System.out.print("세번쨰 숫자 >>  ");
			answer[2] = input.nextInt();
			
			result = game.check(answer);
		}
		
	}
}

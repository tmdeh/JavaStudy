package kr.hs.dgsw.java.c1.baseballGame;

import java.util.Random;

public class baseballGame {
	int strike = 0;
	int ball = 0;
	int numbers[] = new int[3];

	public void randomSet() {
		Random random = new Random();
		for (int i = 0; i < 3; i++) {
			numbers[i] = random.nextInt(10);
			System.out.println(numbers[i]);
		}

	}

	public boolean check(int[] answer) {
		strike = 0;
		ball = 0;
		int j, i;
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				if(answer[i] == numbers[j] && i == j) {
					strike++;
				}
				else if(answer[i] == numbers[j] && i != j) {
					ball++;
				}
			}
		}
		if(strike == 3) {
			System.out.println("축하합니다. 숫자를 맞췄습니다.");
			return true;
		}
		else {
			System.out.println(strike + "S" + ball + "B입니다.");
			return false;
		}
	}
}

package kr.hs.dgsw.java.c1;

import java.util.Scanner;

public class AccumulatorRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Accumulator accumulator = new Accumulator(0);
		
		int input = 0;
		while(-99 !=(input = scanner.nextInt()))
		{
			accumulator.add(input);
			System.out.println("누적값 : " +
			accumulator.getSum());
		}
		scanner.close();
	}
}

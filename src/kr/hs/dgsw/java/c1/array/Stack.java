package kr.hs.dgsw.java.c1.array;

import java.util.Scanner;

public class Stack {
	private static final int SIZE = 100;
	public int pos = 0;
	private String[] array = new String[SIZE];
	
	public void push(String input) {
		array[pos] = input;
		pos++;
	}
	public void pop() {
		if(pos == 0) {
			System.out.println("스택 언더 플로우");
			return;
		}
		pos--;
	}
	public void print() {
		for(int i = 0; i < pos; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		int select = 0;
		while(true) {
			System.out.println("1.푸쉬 2.팝 3.출력 그외 종료");
			select = scan.nextInt();
			if(select == 1) {
				String input = scan.next();
				stack.push(input);
			}
			else if(select == 2) {
				stack.pop();
			}
			else if(select == 3) {
				stack.print();
			}
			else {
				break;
			}
		}
	}
}

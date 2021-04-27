package kr.hs.dgsw.java.c1.array;

import java.util.Scanner;

public class queue {
	private static final int SIZE = 100;
	public int front = 0;
	public int tail = 0;
	private String[] array = new String[SIZE];
	
	public void add(String input) {
		array[front] = input;
		front++;
	}
	public void delete() {
		if(front == tail) {
			System.out.println("값 없음");
		}
		tail++;
	}
	
	public void print() {
		for(int i = tail; i < front; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);
		int select = 0;
		while(true) {
			System.out.println("1.add 2.del 3.print 그외 종료");
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

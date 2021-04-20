package c1;

import java.util.Scanner;

public class Primefactor {
	static Scanner scan = new Scanner(System.in);
	static int uinput = 0;
	static String res = "";
	int[] array;
	public static void input() {
		uinput = scan.nextInt();
	}
	public static  void calc() {
		for(int i = 1; i <= uinput; i++) {
			if(uinput % i == 0) {
				res += i;
				res += ", ";
			}
		}
	}
	public static void show() {
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		input();
		calc();
		show();
	}
}

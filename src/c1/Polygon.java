package c1;

import java.util.Scanner;

//trinangle == 삼각형
//Rectangle == 직사각형
//Circle == 원

public class Polygon {
	Scanner scan = new Scanner(System.in);
	public Polygon() {}
	static int num1;
	int num2;
	String Name = "";
	
	public void  input() {
		num1 = scan.nextInt();
		num2 = scan.nextInt();
	}
	
	public void info(int poly, double area) {
		switch(poly) {
		case 4:
			System.out.println("직사각형");
			System.out.println("밑변 " + num1 + " 높이 " + num2);
			System.out.println("넓이 " + area);
			break;
		case 0:
			System.out.println("원");
			System.out.println("반지름 " + num1);
			System.out.println("넓이 " + area);
			break;
		case 3:
			System.out.println("삼각형");
			System.out.println("밑변 " + num1 + " 높이 " + num2);
			System.out.println("넓이 " + area);
			break;
		}
	}
	
	public double calc() {
		return num1 * num2;
	}
}

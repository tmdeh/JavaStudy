/* 기본 자료형 #자바에는 unsigned가 없다
 * 정수형 : int, long, short, char, byte
 * 실수형 : double, float
 * Boolean : boolean
 * 
 */

package kr.hs.dgsw.java.c1.variable;

public class intStudy {
	public static void main(String[] args) {
		System.out.println("SIZE : " + Integer.SIZE); //32bit
		System.out.println("BYTES : " + Integer.BYTES); //8byte
		System.out.println("MIN : " + Integer.MIN_VALUE); 
		System.out.println("MAX : " + Integer.MAX_VALUE); 
		
		int a = Integer.MAX_VALUE + 1;
		int b = Integer.MIN_VALUE - 1;
		System.out.println(a); //가장 큰값에서 1을 더하면 가장 작은 값이 나온다
		System.out.println(b); //가장 작은값에서 1을 빼면 가장 큰 값이 나온다
	}
}

package kr.hs.dgsw.java.c1.variable;

public class CharStudy {
	public static void main(String[] args) {
		char a = 65;
		char ba = '가';
		char bb = '나';
		
		System.out.println(a);
		//System.out.println(bb - ba);
		
//		for (char i = '가'; i <= '힣'; i++) {
//			System.out.println(i);
//		}
		int count = '힣' - '가' + 1;
		System.out.println(count);
		
		char hanja = '大';
		
		System.out.println(hanja + 0);
	}
}

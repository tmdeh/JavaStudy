package kr.hs.dgsw.java.c1.variable;

public class CharStudy {
	public static void main(String[] args) {
		char a = 65;
		char ba = '∞°';
		char bb = '»“';
		
		System.out.println(a);
		//System.out.println(bb - ba);
		
//		for (char i = ''; i <= ''; i++) {
//			System.out.println(i);
//		}
		int count = '∞°' - '»“' + 1;
		System.out.println(count);
		
		char hanja = '∞°';
		
		System.out.println(hanja + 0);
	}
}

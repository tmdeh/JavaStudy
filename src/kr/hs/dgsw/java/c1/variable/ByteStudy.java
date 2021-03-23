package kr.hs.dgsw.java.c1.variable;

import java.util.Scanner;

public class ByteStudy {
	public static void main(String[] args) {
		System.out.println(Byte.SIZE + " " + Byte.BYTES);
		// -128~127
		
		Scanner scanner = new Scanner(System.in);
		
		byte byteValue = scanner.nextByte();
		
		
		
		
		scanner.close();
	}
	private String convertToEexString(byte byteValue) {
		String result = "";
		
		int high = byteValue / 16;
		int low = byteValue % 16;
		
		return result;
	}
}

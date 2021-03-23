package kr.hs.dgsw.java.c1.variable;

public class VariableLab {
	
	int intValue; //instance 변수
	
	static String strValue; //class 변수
	
	static final int SIZE = 4; //상수
	
	public static void main(String[] args) {
		VariableLab lab1 = new VariableLab();
		VariableLab lab2 = new VariableLab();
		
		lab1.intValue = 5;
		lab2.intValue = 10;
		
		VariableLab.strValue = "Hello"; //이렇게 쓰는걸 권장한다
		lab2.strValue = "world";
		
		System.out.println(lab1.intValue + " " + lab2.intValue);
	}
}
//static을 붙이면 10 10
//안 붙이면 5 10
// static을 붙이면 class 변수가 된다
// instance 변수는 객체에 속한 변수
// class 변수는 class에 속한 변수이다





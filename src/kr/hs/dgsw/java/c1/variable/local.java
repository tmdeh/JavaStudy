package kr.hs.dgsw.java.c1.variable;

public class local {
	public void method1() {
		int localVariable = 0; //아래와 관계없다
		
		//int a = 7; 위에서 선언하게 되면 이름이 if문의 a와 중복이 되어 에러가 난다
		
		if (0 == localVariable) {
			int a = 3;
		}
		else {
			int a = 5;
		}
		
		int a = 7;
		System.out.println(a);
	}
	
	public void method2() {
		int localVariable;
	}
}

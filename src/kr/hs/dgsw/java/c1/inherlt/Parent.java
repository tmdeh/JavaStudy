package kr.hs.dgsw.java.c1.inherlt;

public class Parent {
	public Parent(String str) {
		// TODO Auto-generated constructor stub
		System.out.println("여기는 부모 클래스 : " + str);
	}
	
	private void privateMethod() {
		System.out.println("prvateMethod()-----");
	}
	protected void protectedMethod() { 
		System.out.println("protectedMethod()-----");
	}
}

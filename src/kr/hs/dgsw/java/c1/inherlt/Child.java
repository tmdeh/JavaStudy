package kr.hs.dgsw.java.c1.inherlt;

public class Child extends Parent{
	public static void main(String[] args) {
		Parent parent1 = new Child();
		Parent parent2 = new Parent("aaa");
		Child child = (Child) parent2;
	}
	
	public Child() {
		super("자식에서 선언");
	}
	public void childMethod() {
		System.out.println("childMethod()-----");
	}
}

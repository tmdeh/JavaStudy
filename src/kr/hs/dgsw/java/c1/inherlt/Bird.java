package kr.hs.dgsw.java.c1.inherlt;

public class Bird extends Animal{
	public void fly() {
		System.out.println("새가 날다");
	}
	
	public static void main(String[] args) {
		Bird pigeon = new Bird();
		
		pigeon.setName("비둘기");
		pigeon.setFood("잡것");
		
		pigeon.eat();
		pigeon.fly();
	}
}

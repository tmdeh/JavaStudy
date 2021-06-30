package kr.hs.dgsw.java.c1.if1;

public class Doer {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.eat();
		
		Animal dog2 = new Dog();
		dog2.eat();
		
		Animal animal = new Dog();
		animal.eat();
		
		Sound dog3 = new Dog();
		
		dog1.makeSound();
		dog3.makeSound();
		
		Sparrow sparrow1 = new Sparrow();//다 사용가능
		Bird sparrow2 = new Sparrow(); //다 사용가
		Animal sparrow3 = new Sparrow(); //eat만 사용가
		
		sparrow1.eat();
		sparrow1.fly();
		
		sparrow2.eat();
		sparrow2.fly();
		
		sparrow3.eat();
	}
}

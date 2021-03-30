package kr.hs.dgsw.java.c1.inherlt;

public class Mammal extends Animal{
	
	public void nurseBaby() {
		System.out.println("새끼에게 젖을 먹인다.");
	}
	
	@Override
	public void eat() { //부모에 eat 있더라도 자식에 eat이 있다면 자식의 eat을 쓴다.
		System.out.println("애기는젖을 먹는다");
		
		//부모의 eat를 사용하려면
		super.eat();
	}
	
	public static void main(String[] args) {
		Mammal human = new Mammal();
		Animal dog = new Mammal();
		
		//Mammal mouse = new Animal();
		//자식으로 부모를 선언할수 있지만 부모로 자식을 선언할 수 없다.
		
		human.setName("사람");
		human.setFood("이것 저것");
		
		dog.setName("강아지");
		dog.setFood("사료");
		
		dog.eat();
		//dog는 Animal타입이지만 mammal로 만들었기 때문에 mammal의 eat을 사용한다.
		
//		dog.nurseBaby();
		
		
		human.eat();
	}
}

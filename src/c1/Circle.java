package c1;

public class Circle extends Polygon{
	
	
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("원 반지름 입력");
		circle.input();
		circle.num2 = num1;
		
		double area = circle.calc();
		area *= 3.14;
		circle.info(0, area);
	}
}

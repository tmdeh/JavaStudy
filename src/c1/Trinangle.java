package c1;

public class Trinangle extends Polygon{
	public static void main(String[] args) {
		Trinangle trinangle = new Trinangle();
		System.out.println("삼각형 밑변 높이 입력");
		
		trinangle.input();
		double area = trinangle.calc() / 2;
		
		trinangle.info(3, area);
	}
}

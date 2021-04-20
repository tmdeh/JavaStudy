package c1;

public class Rectangle extends Polygon{
	public Rectangle() {}
	
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println("직사각형의 밑변과 높이 입력");
		
		rectangle.input();
		double area = rectangle.calc();
		
		rectangle.info(4, area);
	}
}

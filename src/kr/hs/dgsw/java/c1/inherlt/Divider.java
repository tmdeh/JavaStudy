package kr.hs.dgsw.java.c1.inherlt;

public class Divider extends Adder{

	@Override
	public int calculate() {
		return operand1 / operand2;
	}
	
	@Override
	public String getOperator() {
		return "/";
	}
	
	public static void main(String[] args) {
		Divider divider = new Divider();
		divider.execute();
	}
}

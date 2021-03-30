package kr.hs.dgsw.java.c1.inherlt;

public class Subtracter extends Adder {
	
	@Override
	public int calculate() {
		return operand1 - operand2;
	}
	
	@Override
	public String getOperator() {
		return "-";
	}
	
	public static void main(String[] args) {
		Subtracter subtractor = new Subtracter();
		subtractor.execute();
	}
}

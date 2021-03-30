package kr.hs.dgsw.java.c1.inherlt;

public class Subtracter extends Adder{
	
	public Subtracter(int operand1, int operand2) {
		super(operand1, operand2);
	}
	
	@Override
	public int calculate() {
		return operand1 - operand2;
	}
	@Override
	public String getOperator() {
		// TODO Auto-generated method stub
		return "-";
	}
	public static void main(String[] args) {
		
	}
}

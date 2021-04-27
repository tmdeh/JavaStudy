package kr.hs.c1.tryCatch;

public class ExceptionStudy{
	public static void methodA() throws Exception{
		Exception e = new Exception("직접 만드 예외");
		throw e;
	}
	
	public static void methodB() throws RuntimeException{
		RuntimeException e = 
				new RuntimeException("직접 만드 예외");
		throw e;
	}
	public static void methodC() throws Exception{
		// do noting
	}
	public static void methodD() throws RuntimeException{
		
	}
	
	public static void main(String[] args) {
		try{
			methodA();
		} catch (Exception e) {
			// TODO: handle exception
		   	e.printStackTrace();
		}
		methodB();
		
		//methodC();
		
		methodD();
	}
}

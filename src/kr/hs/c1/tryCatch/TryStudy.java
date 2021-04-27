package kr.hs.c1.tryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryStudy {
	public static void method1() {
		String str = null;
		
		try {			
			//System.out.println(str.length()); 
			int a = 5 / 0;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void method2() {
		BufferedReader reader = null;
		try {
			File file = new File("C://abc.txt");
			FileReader fileReader = 
					new FileReader(file);
			
			reader = new BufferedReader(fileReader);
			
			String line = reader.readLine();
			System.out.println(line);
			reader.close();
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void method3() throws Exception {
		File file = new File("C://abc.txt");
		FileReader fileReader = 
				new FileReader(file);
		
		BufferedReader reader = new BufferedReader(fileReader);
		
		String line = reader.readLine();
		System.out.println(line);
		reader.close();
	}
	
	
	public static void main(String[] args) {
		//method1();
		//method2();
		try {
			method3();			
		} catch(Exception e) {
			
		}
	}
}

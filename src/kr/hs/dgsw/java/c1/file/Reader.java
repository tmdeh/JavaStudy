package kr.hs.dgsw.java.c1.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Arrays;

public class Reader {
	public static void main(String[] args) {
		try {
			File file = new File("/Users/yuseungdo/Documents/dgsw/fileA");
			
			InputStream is = new FileInputStream(file);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			
			String line = null;
			
			while((line=reader.readLine()) != null) {
				System.out.println(line);
				System.out.println(line.getClass().getName());
			}
			
			reader.close();
			
//			int value;
//			char ch;
//			byte[] buffer = new byte[10];
//			int length = is.read(buffer);
//			String str = new String(buffer, 0, length);
//			byte[] buffer = new byte[10];
//			byte[] bytes = new byte[0];
//			
//			
//			String str = null;
//			int length;
//			while(is.available() > 0) {
//				length = is.read(buffer);
//				
//				str = new String(buffer, 0, length);
//				System.out.println(str);
//				
//			}
			
			
//			System.out.println(str);
			
//			while(is.available() > 0) {
//				is.read(buffer);
//				System.out.println(new String(buffer, "UTF-8"));
//			}
			
//			is.close();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

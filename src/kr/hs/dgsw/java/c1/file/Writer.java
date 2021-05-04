package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Writer {
	public static void main(String[] args) {
		
		try {
			File file = new File("/Users/yuseungdo/Documents/dgsw", "fileA");
			file.createNewFile();
			
			OutputStream os = new FileOutputStream(file);
			
			String str = "안녕하세요";
			byte[] bytes = str.getBytes();
			
			
			
			os.write(bytes);
			
			char ch = 'A';
			os.write(ch);
			
			os.write('b');
			
			os.write('z');
			
			os.close();
			
			
		}catch(Exception e) {
			
		}
	}
	
}

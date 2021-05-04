package kr.hs.dgsw.java.c1.file;

import java.io.File;

public class FileLab {
	public static void main(String[] args)throws Exception {
		File file = new File("abc.txt");
		System.out.println("getName : " + file.getName());
		
		boolean exists = file.exists(); //존재하는지 아닌지
		
		System.out.println("exist : " + exists);
		
		boolean isDirectory = file.isDirectory(); //디렉토리인지 아닌지
		
		System.out.println("isDirectory : " + isDirectory);
		
		File dir = new File("/Users/yuseungdo/Documents/dgsw");
		
		File file1 = new File("/Users/yuseungdo/Documents/dgsw");
		isDirectory = file1.isDirectory();
		System.out.println("isDirectory : " + isDirectory);
		
		String path = file.getAbsolutePath(); //파일의 절대 경로 
		System.out.println("getAbsolutePath : " + path);
		
		String path1 = file.getCanonicalPath(); //파일의 절대 경로
		System.out.println("getCanonicalPath : " + path1);
		
		
		long length = file.length();
		System.out.println("length : " + length);
		
		//length = dir.length();
		
		
	}
}

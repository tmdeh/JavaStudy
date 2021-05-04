package kr.hs.dgsw.java.c1.file;

import java.io.File;

public class DirLab {
	public static void main(String[] args) throws Exception {
//		File dir = new File("/Users/yuseungdo/Documents/dgsw/sub3", "qqq");
//		
//		boolean exist = dir.exists();
//		
//		System.out.println("exist : " + exist);
//		
//		boolean result = dir.mkdir();
//		System.out.println("mkdir : " + result);
//		
//		dir.delete();
		
		File dir1 = new File("/Users/yuseungdo/Documents/dgsw/");
		File[] files = dir1.listFiles();
		for(File file : files) {
			System.out.print(file.getName());
			if(file.exists()) {
				System.out.println("	File");
			}
			else {
				System.out.println("	Dir");
			}
		}
	}
}

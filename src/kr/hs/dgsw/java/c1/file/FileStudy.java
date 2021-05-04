package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.io.IOException;

public class FileStudy {
	public File makeFile(String directory,
			String fileName) throws IOException {
		File file = new File(directory, fileName);
		
		boolean result = file.createNewFile();
		
		System.out.println("파일 생성 : "+result);
		return file;
	}
	
	public void deleteFile(File file) {
		File file1 = new File("/Users/yuseungdo/Documents/dgsw", "first.abc");
		
		boolean result = file1.delete();
		System.out.println("파일 삭제 : " + result);
	}
	
	public File rename(File file, String newName) throws Exception{
		File renamed = new File(file.getParent(),newName);
		boolean result = file.renameTo(renamed);
		
		System.out.println("이름 변경 : " +result + "	" + renamed.getAbsolutePath());
		return renamed;
		
		
	}
	
	public void move(File file, String directory) {
		File newLocation = new File(file.getParent() + "/" + directory, file.getName());
		
		
		boolean result = file.renameTo(newLocation);
		
		
		System.out.println("위치 변경 : " + result);
	}
	
	public static void main(String[] args) {
		try {
			FileStudy fileStudy = new FileStudy();
			File file = fileStudy.makeFile("/Users/yuseungdo/Documents/dgsw", "first.abc");
			
			file = fileStudy.rename(file, "second.qqq");
			
			fileStudy.move(file, "sub1");
			
			//fileStudy.deleteFile(file);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

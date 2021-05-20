package kr.hs.dgsw.java.c1.cmd;

import java.io.File;
import java.io.IOException;

public class Command {
	private String path;
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
	public void ls() {
		try {
			//File directory = getSubDirectory(getArgument(0));
			//File[] files = directory.listFiles();		

			//showList(files);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void cd(String name) {
		System.out.println("cd");
	}
	public void touch(String name) {
		File file = new File(path, name);
		if(file.exists()) {
			System.out.println("이미 존재하는 파일");
			return;
		}
		try {
			boolean result = file.createNewFile();
			
			if(result == true) {
				System.out.println("생성 성공");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void rm(String name) {
		File file = new File(path, name);
		try {
			boolean result = file.delete();
			
			if(result == true) {
				System.out.println("삭제 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void mkdir(String name) {
		File dir = new File(path + "/" + name);
		if (!dir.exists()) {
			try{
			    dir.mkdir(); //폴더 생성합니다.
			    System.out.println("폴더가 생성되었습니다.");
		        } 
		        catch(Exception e){
			    e.getStackTrace();
		        }        
	         }else {
			System.out.println("이미 폴더가 생성되어 있습니다.");
		}
	}
	public void rmdir(String name) {
		File dir = new File(path);
		try {
		    while(dir.exists()) {
			File[] folder_list = dir.listFiles();
					
			for (int j = 0; j < folder_list.length; j++) {
				folder_list[j].delete(); //파일 삭제 
				System.out.println("파일이 삭제되었습니다.");
						
			}
					
			if(folder_list.length == 0 && dir.isDirectory()){ 
				dir.delete();
				System.out.println("폴더가 삭제되었습니다.");
			}
	            }
		 } catch (Exception e) {
			e.getStackTrace();
		}
	}
	
}

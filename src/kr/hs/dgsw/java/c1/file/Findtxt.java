package kr.hs.dgsw.java.c1.file;

import java.io.File;
import java.io.File;

public class Findtxt {

	public void findTxtFiles(File dir) {
		File[] files = dir.listFiles();
		if (files == null) {
			return;
		}
		
		for (File file : files) {
			if (file.isDirectory()) {
				findTxtFiles(file);
			}
			else {
				if (match(file)) {
					printFile(file);
				}
			}
		}
	}

	public void printFile(File file) {
		System.out.println(file.getAbsolutePath());
	}
	
	public boolean match(File file) {
		return (file.getName().toLowerCase().endsWith(".txt"));
	}
	
	public static void main(String[] args) {
		try {
			Findtxt finder = new Findtxt();
			finder.findTxtFiles(new File("/"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
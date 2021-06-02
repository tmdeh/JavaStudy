package kr.hs.dgsw.java.c1.cmd2;

import java.io.File;

public class CommandRemoveFile extends Command{
	public CommandRemoveFile(File dir, String[] tokens) {
		super(dir, tokens);
	}
	
	@Override
	public File execute() {
		try {
			File directory = getSubDirectory(getArgument(0));
			
			
			return directory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return dir;
	}
}

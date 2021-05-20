package kr.hs.dgsw.java.c1.cmd;

import java.util.Scanner;

public class run {
	public static void main(String[] args) {
		Command cmd = new Command();
		Scanner scan = new Scanner(System.in);
		String select;
		String name = null;
		
		cmd.setPath("/Users/yuseungdo/Documents/dgsw");
		
		while(true) {
			System.out.print(cmd.getPath() + " >> ");
			select = scan.next();
			if(select == "exit") {
				break;
			}
			switch(select) {
			case"ls":
				cmd.ls();
				break;
				
			case"cd":
				name = scan.next();
				cmd.cd(name);
				break;
				
			case"touch":
				name = scan.next();
				cmd.touch(name);
				break;
			case"rm":
				name = scan.next();
				cmd.rm(name);
				break;
			case"mkdir":
				name = scan.next();
				cmd.mkdir(name);
				break;
			case"rmdir":
				name = scan.next();
				cmd.rmdir(name);
				break;
			default:
				System.out.println("다시 입력해주세요.");
				break;
			}
		}
		scan.close();
	}
}

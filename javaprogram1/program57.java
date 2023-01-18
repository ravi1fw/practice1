package javaprogram1;

import java.io.*;

public class program57 {

	public static void main(String[] args ) throws IOException  {
		File f = new File("practice.txt");
		if(f.createNewFile()) {
			FileInputStream fs = new FileInputStream(f);

			int i=fs.read();
			
			while(i!=-1) {
				System.out.print((char)i);
				i=fs.read();
				System.out.println("file succes");
			}
		}else {
			System.out.println("file alreasdy exists");
		}
		
		}
		
	}

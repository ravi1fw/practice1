package javaprogram1;

import java.io.*;

public class program52 {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Asus\\eclipse-workspace\\firstProgram\\src\\javaprogram1\\practice.txt");
		FileWriter fw;
		FileReader fr;
		try {
			if(f.exists()) {
				fw = new FileWriter(f);
				fw.write("hello welcome wish you a happy new year....");
				fw.close();
				
				fr = new FileReader(f);
				char [] arr = new char[100];
				fr.read(arr);	
				fr.close();
				System.out.println(arr);
			}else {
				f.createNewFile();
			}
				
			} catch (IOException e) {
			System.out.println("file not fond");
		}
		System.out.println("success");

	}

}

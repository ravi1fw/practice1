package javaprogram1;

import java.io.*;
import java.util.Scanner;

public class program58 {

	public static void main(String[] args) throws IOException {
		File f = new File("practice.txt");
		FileOutputStream op = new FileOutputStream(f,true);
		
		Scanner sc = new Scanner(System.in);
		String message;
		
		System.out.println("ENter the message:- ");
		message=sc.nextLine();
		
		op.write(message.getBytes());
		op.close();

	}

}

package javaprogram1;

import java.io.*;
import java.util.Scanner;

public class program53 {

	public static void main(String[] args) {
		System.out.println("1.New user\n2.Sign-In");
		Scanner sc = new Scanner(System.in);
		File f = new File("practice.txt");
		int user = sc.nextInt();
		sc.nextLine();
		switch(user) {
		case 1:
			System.out.println("Enter username:- ");
			String s = sc.nextLine();
			System.out.println("Enter password:- ");
			int pass =Integer.parseInt(sc.nextLine());
			System.out.println("Confirm Password:- ");
			int pass1 =Integer.parseInt(sc.nextLine());
			try {
				if(f.createNewFile()) {
					FileWriter fw = new FileWriter(f);
					fw.write(s);
					fw.write(Integer.toString(pass));
//					if(pass == pass1) {
//						fw.write(pass1);
//					}else {
//						System.out.println("plzz check password");
//					}
					fw.close();
					System.out.println("FIle is created");
				}
				else {
					System.out.println("File not created");
				}
			} catch (IOException e) {
				System.out.println("Invalid user");
			}
			break;
		case 2:
			if(f.exists()) {
				try {
					FileReader fr = new FileReader(f);
					char []arr= new char[100];
					fr.read(arr);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}
	}

}

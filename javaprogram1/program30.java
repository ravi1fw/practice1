package javaprogram1;

import java.util.Scanner;

public class program30 {

	public static void main(String[] args) {
		System.out.println("Plese enter any character:- ");
		Scanner sc = new Scanner(System.in);
		char chr = sc.next().charAt(0);
		chr=Character.toLowerCase(chr);
		switch(chr) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowels");
			break;
		default:{
			System.out.println("Not a vowels");
		}
	}

	}

}

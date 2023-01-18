//Write a program to print numbers from 1 to 10.

package javaprogram1;

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int i=0;
		System.out.println("Enter the 10 value:- ");
		for(int b:a) {
			a[i]=Integer.parseInt(sc.nextLine());
			i=i+1;
		}
		System.out.println("The value are:- ");
		for(int b:a) {
			System.out.println(b);
		}
		
	}
}


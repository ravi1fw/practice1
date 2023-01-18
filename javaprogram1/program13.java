//Write a program that prompts the user to input a positive integer. It should
//then print the multiplication table of that number.
package javaprogram1;

import java.util.Scanner;

public class program13 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any positive number for multiplication:- ");
	int b = sc.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(b+"X"+i+" = "+(b*i));
	}
}
}

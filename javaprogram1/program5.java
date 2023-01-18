//write a java program that takes two number as input and display the product of two numbers.

package javaprogram1;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two numbers:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The product of "+a+" and "+b+ " is "+(a*b));

	}

}

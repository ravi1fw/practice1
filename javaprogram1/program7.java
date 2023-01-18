//write a java program and compute the sum of digit of an integer

package javaprogram1;

import java.util.Scanner;

public class program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0,digit;
		System.out.println("Enter the digit to calculate there sum:- ");
		int a = sc.nextInt();
		while(a>0) {
			digit = a %10;
			sum = sum + digit;
			a = a/10;
		}
		System.out.println("The sum of digit of number is :- "+sum);
	}
	
}

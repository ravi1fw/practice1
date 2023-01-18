//Write a do-while loop that asks the user to enter two numbers. The numbers
//should be added and the sum displayed. The loop should ask the user
//whether he or she wishes to perform the operation again. If so, the loop
//should repeat; otherwise it should terminate.

package javaprogram1;

import java.util.Scanner;

public class program15 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int c;
	do {
		System.out.println("Enter the two numbers:- ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("sum of two number is :- "+(a+b));
		System.out.println("you want to perform operation again press 1 for yes and press 2 for not ");
		c=sc.nextInt();
	}while(c==1);
	System.out.println("Thanks for using these operation!!! ");
	}
}

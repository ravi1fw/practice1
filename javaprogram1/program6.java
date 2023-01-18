//write a java program that takes a number as input and prints its multiplication table upto 10

package javaprogram1;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number for multiplication :- ");
		int a = sc.nextInt();
		for(int i = 1 ; i <=10; i++) {
			int c = a * i;
			System.out.println(a+" X "+i+" = "+c);
		}
	}

}

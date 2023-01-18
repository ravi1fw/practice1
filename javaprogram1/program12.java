//Write a program to calculate the sum of first 10 natural number.

package javaprogram1;

import java.util.Scanner;

public class program12 {
	public static void main(String[] args) {
		 int a[]= {1,2,3,4,5,6,7,8,9,10};
		 int sum=0;
		 for(int num:a) {
		 	sum=sum+num;
		 }		
		 System.out.println("The sum of 10 natural numbers are:- "+sum);
	}
}

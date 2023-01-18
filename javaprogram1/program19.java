//Write a Java program to find the maximum and minimum value of an array.
package javaprogram1;

import java.util.Scanner;
public class program19 {

	public static void main(String[] args) {
		int a[]= new int [7];
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 7 elements in array:- ");
		for( int b:a) {
			a[i]=sc.nextInt();
			i=i+1;
		}
		int max=a[0];
		int min=a[0];
		for(int b:a) {
				if(b>max) {
					max=b;
				}
			}
		for(int b:a) {
			if(b<min) {
				min=b;
			}
		}
		System.out.println("The maximum value of array is :- "+max);
		System.out.println("The minimum value of array is :- "+min);
		}
	}

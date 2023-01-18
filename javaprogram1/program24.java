//Write a program to get the transpose of the given matrix.
package javaprogram1;

import java.util.Scanner;

public class program24 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows:- ");
		int r = sc.nextInt();
		System.out.println("Enter the Coloum:- ");
		int c = sc.nextInt();
		
		int array1[][]=new int[r][c];
		
		System.out.println("Enter the "+(r*c)+" Elements for the first matrix");
		for(int i = 0 ; i <array1.length;i++) {
			for(int j = 0 ; j <array1.length;j++) {
				array1[i][j]=sc.nextInt();				
			}
		}
		
		System.out.println("First matrix element are:- ");
		for(int i = 0 ; i <array1.length;i++) {
			for(int j = 0 ; j <array1.length;j++) {
				System.out.print(" "+array1[i][j]);	
			}
			System.out.println(" ");
		}
		System.out.println("Tranpose matrix element are:- ");
		for(int i = 0 ; i <array1.length;i++) {
			for(int j = 0 ; j <array1.length;j++) {
				System.out.print(" "+array1[j][i]);	
			}
			System.out.println(" ");
		}
	}

}

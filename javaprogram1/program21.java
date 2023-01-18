//Write a Java program to add two matrices of the same size
package javaprogram1;

import java.util.Scanner;

public class program21 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the rows:- ");
		int r = sc.nextInt();
		System.out.println("Enter the Coloum:- ");
		int c = sc.nextInt();
		
		int array1[][]=new int[r][c];
		int array2[][]=new int[r][c];
		int sum[][] = new int[r][c];
		
		
		System.out.println("Enter the "+(r*c)+" Elements for the first matrix");
		for(int i = 0 ; i <array1.length;i++) {
			for(int j = 0 ; j <array1.length;j++) {
				array1[i][j]=sc.nextInt();				
			}
		}
		System.out.println("Enter the "+(r*c)+" Elements for the second matrix");
		for(int i = 0 ; i <array2.length;i++) {
			for(int j = 0 ; j <array2.length;j++) {
				array2[i][j]=sc.nextInt();				
			}
		}
		System.out.println("First matrix element are:- ");
		for(int i = 0 ; i <array1.length;i++) {
			for(int j = 0 ; j <array1.length;j++) {
				System.out.print(" "+array1[i][j]);	
			}
			System.out.println(" ");
		}
		
		System.out.println("second matrix element are:- ");
		for(int i = 0 ; i <array1.length;i++) {
			for(int j = 0 ; j <array1.length;j++) {
				System.out.print(" "+array2[i][j]);	
			}
			System.out.println(" ");
		}
		
		for(int i = 0 ; i <sum.length;i++) {
			for(int j = 0 ; j <sum.length;j++) {
				sum[i][j]=array1[i][j]+array2[i][j];			
			}
		}
		System.out.println("Sum of matrix are:- ");
		for(int i = 0 ; i <sum.length;i++) {
			for(int j = 0 ; j <sum.length;j++) {
				System.out.print(" "+sum[i][j]);			
			}
			System.out.println(" ");
		}
		
	}
}

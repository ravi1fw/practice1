//Given a integer n. We have n*n values of a 2-d array, and n values of 1-d array. Task is to
//find the sum of the left diagonal values of the 2-d array and the max element of the 1-d array
//and print them with space in between.

package javaprogram1;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		int n=3;
		Scanner sc = new Scanner(System.in);
		
		int arr[][]=new int[n][n];
		int arr1[]=new int[n];
		int sum=0;
		
		System.out.println("Enter the 9 element for 2d arrray:- ");
		for(int i = 0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter the 3 element for 1d arrray:- ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i = 0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr.length;j++) {
				sum=arr[0][0]+arr[1][1]+arr[2][2];
			}
		}
		System.out.println("The 2-d array is:- ");
		for(int i = 0 ;i<arr.length;i++) {
			for(int j=0 ;j<arr.length;j++) {
				System.out.print(" "+arr[i][j]);
			}
			System.out.println(" ");
		}
		
		System.out.println("the 1d arrray is:- ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(" "+arr1[i]);
		}
		
		System.out.format("\n\nthe sum of 2-d array of left diagonal %d + %d + %d "
				+ "is %d \n",arr[0][0],arr[1][1],arr[2][2],sum);
		
		int max=arr1[0];
		for(int i=1;i<arr1.length;i++) {
			if(max<arr1[i]) {
				max=arr1[i];
			}
		}
		System.out.println("The max element in 1-D array is:- "+max);
		
	}

}

//Write a Java program to copy an array by iterating the array

package javaprogram1;

public class program18 {

	public static void main(String[] args) {
		int a[]= {12,23,44,51,12,65,78};
		int b[]=a.clone();
		System.out.println("Original Array:- ");
		for(int num:a) {
			System.out.println(num);
		}
		System.out.println("Copy Array:- ");
		for(int num1:b) {
			System.out.println(num1);
		}

	}

}

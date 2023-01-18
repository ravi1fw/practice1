//Write a Java program to sum values of an array.
package javaprogram1;

public class program17 {

	public static void main(String[] args) {
		int a[]= {12,23,34,64,78};
		int sum=0;
		for(int num:a) {
			sum=sum+num;
		}
		System.out.println("The sum of array are :- "+sum);

	}

}

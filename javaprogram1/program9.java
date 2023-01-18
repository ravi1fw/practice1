//write a java program that accepts two integers from the user and then prints the sum,the differnce, the product, 
//the average, the distance(the difference between integer ), the maximum (the larger of the two integers ),the minimum
//(smaller of the two numbers)


package javaprogram1;

import java.util.Scanner;

class operation{
	int a; 
	int b;
	operation(int a,int b){
		this.a=a;
		this.b=b;
	}
	void arithametic() {
		System.out.println("The addition of "+a+" and "+b+" is "+(a+b));
		System.out.println("The subtraction  of "+a+" and "+b+" is "+(a-b));
		System.out.println("The Multiplication of "+a+" and "+b+" is "+(a*b));
		System.out.println("The average of "+a+" and "+b+" is "+(a+b)/2);
	}
	void max() {
		if(a>b) {
			System.out.println("Maximum number is :- "+a);
		}else {
			System.out.println("Maximum number is :- "+b);
		}
	}
	void min() {
		if(a<b) {
			System.out.println("Minimum number is :- "+a);
		}else {
			System.out.println("Minimum number is :- "+b);
		}
	}
	
}
public class program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		operation op = new operation(a,b);
		op.arithametic();
		op.max();
		op.min();
	}

}









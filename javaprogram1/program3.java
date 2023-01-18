//write a program to print the area of rectangle by crrating a class named Area taking the values of its length and
//breadth as parameters of its constructor and having a method named returnArea which returns the area of rectangle.
//length and breadth of rectangle are entered through keyboard


package javaprogram1;

import java.util.Scanner;

class area{
	int l;
	int b;
	area(int l, int b){
		this.l=l;
		this.b=b;
	}
	int returnArea(){
		int result=l*b;
		return result;
	}
}
public class program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ;
		int b;
		System.out.println("Enter the length and breadth:- ");
		a = sc.nextInt();
		b = sc.nextInt();
		area ar=new area(a,b);
		int result = ar.returnArea();
		System.out.println("the area of rectangle is :- "+result);
	}

}

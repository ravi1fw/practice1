
//We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape'
//  with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' 
//  taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' 
//  is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the 
//  three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square 
//  and circle respectively. Create an object of class 'Area' and call all the three methods. 

package javaprogram1;

import java.util.Scanner;

abstract class shape{
	
	abstract void rectangleArea(int l,int b);
	abstract void squareArea(int sq);
	abstract void circleleArea(float r);
	
}
 class area1 extends shape{
	@Override
	public void rectangleArea(int l , int b) {
		int c = l * b;
		System.out.println("area of rectangle is:- "+c);
	}

	@Override
	void squareArea(int sq) {
		System.out.println("Area of sqaure is:- "+(sq*sq));
	}

	@Override
	void circleleArea(float r) {
		System.out.println("Area of Circle is :- "+(3.14*r*r));
		
	}
}

public class program43 {

	public static void main(String[] args) {
		area1 a = new area1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length and breadth:- ");
		int len = sc.nextInt();
		int br = sc.nextInt();
		a.rectangleArea(len, br);
		
		System.out.println("\nEnter the one-Side of sqaure :- ");
		int sq = sc.nextInt();
		a.squareArea(sq);
		
		System.out.println("\nEnter the Radius of circle :- ");
		float c = sc.nextFloat();
		a.circleleArea(c);
		
		
	}

}

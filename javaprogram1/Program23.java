//Write a program which finds if the given array is a palindrome. A palindrome array is in
//which the elements either printed from the beginning or printed from the end should be
//the same.

package javaprogram1;

public class Program23 {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		int b[]=new int [5];
		for(int i=4;i>=a[i];i--) {
			b[i]=a[i];
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		boolean Ischeck=false;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==b[i]) {
//				Ischeck=true;
//			}else {
//				Ischeck=false;
//			}
//		}
//		if(Ischeck) {
//			System.out.println("The array is palindrome array");
//			}else {
//				System.out.println("The array is not a  palindrome array");				
//			}
//		}
//
//	}

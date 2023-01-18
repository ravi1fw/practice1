package javaprogram1;

public class program39 {

	public static void main(String[] args) {
		String a[]= {"Ravi","Naruto","sasuke","minato","kakashi"};
		
		int a1[] = {1,2,3,4,5,0,56};
		
		try{
			for(int i=0 ; i <= 7 ; i++) {
				System.out.println(a1[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
			System.out.println(e.getMessage()+"   Array is not valid bcoz");
//			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		System.out.println("Program completed");
		
		

	}

}

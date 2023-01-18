package javaprogram1;


class try1{
	
	void meth() {
		System.out.println(10/0);
	}
}



public class program40 {
	
	public static void main(String[] args)  throws ArithmeticException  {
		
		try1 t = new try1();
		try {
			t.meth();			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

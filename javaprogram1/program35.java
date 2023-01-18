package javaprogram1;

class outer_class{
	int a;
	
	static void get1() {
		System.out.println("hello");
	}
	
	static class inner_class{
		int b;
		
		void inner(){
			System.out.println("Hello inner class");
		}
	
	}
	inner_class c2 = new inner_class();
}

public class program35 {

	public static void main(String[] args) {
		outer_class c1 = new outer_class();
//		c1.c2.b=9;
//		c1.c2.inner();
//		outer_class.inner_class c2 = new outer_class.inner_class();//valid in case of static
//		c2.inner();
		
		outer_class.get1();
//		c1.get1();
		
		c1.c2.inner();
	}

}

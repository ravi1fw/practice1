package junit;

import junit.framework.TestCase;


public class example2 extends TestCase{
int a,b;
	
	public void setUp() {
		a=3;
		b=3;
	}
	public void testaddMethod() {
		int c=a+b;
		System.out.println(c);
		assertTrue(c==6);
	}
	public static void main(String[] args) {
		example2  a = new example2 ();
		a.testaddMethod();

	}

}

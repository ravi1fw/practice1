package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class example3 {
	
	@Before
	public void show1() {
		String name="naruto uzamaki";
		assertEquals(name,"naruto uzamaki");
	}

	@Test
	public void show() {
		String name="Ravi Pandey";
		System.out.println(name);
		assertEquals(name,"Ravi Pandey");
	}
	
	@After
	public void show2() {
		String name="Goku";
		assertEquals(name, "Goku");
	}
	
	public static void main(String[] args) {
		
		example3 ex3 = new example3();
		ex3.show();
		ex3.show1();

	}

}

package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class example1 {
	
	String orgName;
	
	@Test
	public void show() {
		orgName="EduBridge";
		System.out.println("Org Name:- "+orgName);
		assertEquals(orgName, "EduBridge");
	}

	public static void main(String[] args) {
		example1 ex1 = new example1();
		ex1.show();

	}

}
/*
Unit testing:- a set of code ->functions.
Junit:- Testing -> Real objects
Mockito:- Testing -> mocking the objects..

@annotations -this is the common practice junit 4 onwards

extends testcase

steps to create junit testing:- 
firstprogram -> right click on these -> build path -> configure build path -> libraries -> click class path then add
    add libraries -> junit -> junit4 -> apply -> close -> again go to step configure buld path ->
    order and export -> apply -> apply and close ....  

*/
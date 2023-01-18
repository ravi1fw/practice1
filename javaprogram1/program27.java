package javaprogram1;

import java.io.UnsupportedEncodingException;

public class program27 {

	public static void main(String[] args) {
		String str = "abc";
		byte b [] ;
		try {
			b=str.getBytes("UTF-16");
			for(int i=0 ; i<b.length; i++) {
				System.out.println(b[i]); 
			}
		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
		}
	
	}

}

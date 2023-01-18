package javaprogram1;

import java.util.*;

public class program55 {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(12,"sasuke");
		tm.put(276,"naruto");
		tm.put(321,"lufhy");
		tm.put(445,"sakura");
		tm.put(576,"tan-tan");
		tm.put(698,"obito");
		
		System.out.println(tm);
		tm.put(321, "zoro");
		System.out.println(tm);
		tm.put(323, null);
		tm.put(122, null);
		System.out.println(tm);
		
		
	}

}

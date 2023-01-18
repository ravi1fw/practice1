package javaprogram1;

import java.util.*;

public class program54 {

	public static void main(String[] args) {
		SortedMap<Integer,String> sm = new TreeMap<>();
		sm.put(12,"Ravi");
		sm.put(33,"naruto");
		sm.put(43,"jiraya");
		sm.put(11,"kakashi");
		sm.put(56,"sasuke");
		sm.put(18,"itachi");
		sm.put(20,"gara");
		
		System.out.println(sm);
		System.out.println(sm.firstKey());
		System.out.println(" ");
		System.out.println(sm.lastKey());
		System.out.println("");
		System.out.println(sm.headMap(40));
		System.out.println("");
		System.out.println(sm.tailMap(40));
		System.out.println(" ");
		System.out.println(sm.subMap(20, 80));
		System.out.println(" ");
		
	}

}

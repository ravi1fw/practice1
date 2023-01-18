package javaprogram1;

import java.util.*;

public class program56 {

	public static void main(String[] args) {
		NavigableMap<Integer,String> nm = new TreeMap<>();
		nm.put(1,"Naruto");
		nm.put(2,"sasuke");
		nm.put(3,"Minato");
		nm.put(4,"Itachi");
		nm.put(5,"gara");
		nm.put(6,"kakashi");
		System.out.println(nm);
	
		System.out.println(	nm.lowerKey(4));//<
		System.out.println(nm);	
		System.out.println(nm.floorKey(3));//<=
		System.out.println(nm);
		System.out.println(nm.pollFirstEntry());
		System.out.println(nm);
		System.out.println(nm.higherKey(4));//>
		System.out.println(nm);
		System.out.println(nm.ceilingKey(3));//>=
		System.out.println(nm);
		System.out.println(nm.pollLastEntry());
		System.out.println(nm);
		System.out.println(nm.descendingMap());
//		System.out.println(nm);
		
		

	}

}

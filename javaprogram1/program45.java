package javaprogram1;

import java.util.*;


public class program45 {

	public static void main(String[] args) {
		List <String> l = new ArrayList<String>();
		l.add("Ravi");
		l.add("java");
		l.add("python");
		l.add("css");
		l.add("html");
		
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println(l);

		List <Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(23);
		l2.add(45);
		l2.add(152);
		l2.add(363);
		
		Iterator i2 = l2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());			
		}
		System.out.println(l2);
		
		System.out.println("remove index of:- ");
		Scanner sc = new Scanner(System.in);
		Integer a2 = new Integer(sc.nextLine());
		
		l2.remove(a2);
		
		System.out.println(l2);
	}
	

}

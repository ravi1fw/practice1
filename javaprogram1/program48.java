package javaprogram1;
import java.util.*;

public class program48 {

	public static void main(String[] args) {
		Stack <Integer> l = new Stack<>();
		l.push(23);
		l.push(34);
		l.push(29);
		l.push(98);
		l.push(21);
		
		Iterator <Integer> i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("####");
		System.out.println(l.peek());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);
		System.out.println(l.pop());
		System.out.println(l);

	}

}

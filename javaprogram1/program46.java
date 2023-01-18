package javaprogram1;
import java.util.*;

public class program46 {

	public static void main(String[] args) {
		List <String> l = new LinkedList<String>();
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
	}

}

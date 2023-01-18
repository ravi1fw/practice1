package javaprogram1;
import java.util.*;

public class program47 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("hiii");
		v.add("naruto");
		v.add("sasuke");
		v.add("minato");
		v.add("jiraya");
		System.out.println(v);
		
		Iterator <String> i =v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(v.get(2));
		v.remove(0);
		System.out.println(v);
		v.removeAll(v);
		System.out.println(v);

	}

}

package javaprogram1;
import java.util.*;

public class program49 {

	public static void main(String[] args) {
		Queue <Integer> q = new PriorityQueue<Integer>();
		q.add(12);
		q.add(342);
		q.add(11);
		q.add(125);
		q.add(532);
		
		Iterator i = q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("###########");
		System.out.println(q.peek());//pick the element
		System.out.println(q);
		System.out.println(q.poll());//remove the first element of the array 
		System.out.println(q);
		System.out.println(q.remove(342));//remove specific element
		System.out.println(q);

	}

}

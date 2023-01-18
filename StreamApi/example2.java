package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class example2 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Aniket");
		l.add("Rohan");
		l.add("Anhishek");
		l.add("Harsh");
		l.add("Gaurav");
		l.add("Nikhil");
		l.add("Om");
		l.add("Naresh");
		l.add("Rakesh");
		l.add("Golu");
		
		l.stream().filter(s->s.startsWith("s")).forEach(System.out::println);
		
		System.out.println("printing value of A");
		List<String> l2=l.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());
		l2.forEach(System.out::println);
		
		System.out.println("sorted list");
		l.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}

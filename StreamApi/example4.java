package StreamApi;

import java.util.*;
import java.util.stream.Collectors;

public class example4 {

	public static void main(String[] args) {
		List<Integer>l = new ArrayList<>();
		List<Integer>l2 = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		
		for(int i=1;i<=10;i++) {
			l2.add(i);
		}
//		l.stream().peek(System.out::println).forEach(System.out::println);
		List<Integer> l21=l.stream().peek(System.out::println).collect(Collectors.toList());
		
		long result=l21.stream().distinct().count();
		
		Integer v1 = l21.stream().max(Integer::compare).get();
		Integer v2 = l21.stream().min(Integer::compare).get();
		
		
		System.out.println("result of count function");
		System.out.println(result);
		
		System.out.println("result of Max function");
		System.out.println(v1);
		
		System.out.println("result of Min function");
		System.out.println(v2);
		
		int sum=l21.stream().reduce(0, (subtotal,element)->subtotal+element);
		System.out.println("Results of reduce -- for doing sum");
		System.out.println(sum);
		
		int sum1=l21.stream().reduce(0, Integer::sum);
		System.out.println("Results of reduce -- for doing sum");
		System.out.println(sum1);
		
		List<String> letters=Arrays.asList("a","b","c","d","e");
		String result1=letters.stream().reduce("",(partialstring,element)->partialstring+element);
	}

}

package javaprogram1;
import java.util.*;

public class program50 {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three",3);
		
		System.out.println(numbers.keySet());
		System.out.println(numbers.values());
		System.out.println(numbers.entrySet());
		
//		int val = numbers.putAll();
		
		System.out.println();
//		int value = numbers.remove("Two");
//        System.out.println("Removed Value: " + value);
	}
}

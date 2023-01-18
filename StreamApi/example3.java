package StreamApi;

import java.util.stream.Collectors;

@FunctionalInterface
interface stringSpace {
	String addSpace(String s);
}

public class example3 {
	String insertSpace(String p) {
		stringSpace obj=(s)->{
			return s.toString().chars().mapToObj(c->(char)c+" ").collect(Collectors.joining()).trim();
		};
		return obj.addSpace(p);
	}
public static void main(String[] args) {
	example3 ex = new example3();
	System.out.println(ex.insertSpace("capgemini"));
}
}

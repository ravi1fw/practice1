package javaprogram1;

class abc{
	static int count=0;
	
	static void increment() {
		count++;
	}
	
	static void display() {
		System.out.println(count);
	}
}
public class programm34 {

	public static void main(String[] args) {
//		abc aa = new abc();
//		aa.increment();
//		aa.display();
		
//		aa.increment();
//		aa.display();
//		
//		abc aa1 = new abc();
//		aa1.increment();
//		aa1.display();
		
		
		abc.increment();
		abc.display();
		
		abc.increment();
		abc.display();

	}

}

package javaprogram1;

abstract class out{
	abstract void add();
	
	void display() {
		System.out.println("Hello world");
	}
}

class def1 extends out{
	void add() {
		System.out.println("extended class implement");
	}
}
public class program37 {

	public static void main(String[] args) {
		def1 df = new def1();
		df.add();
		df.display();

	}

}

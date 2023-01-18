
package javaprogram1;

abstract class parent{
	
	public abstract void message();
	
}
class sub extends parent{
	@Override
	public void message() {
		System.out.println("This is first subclass");
	}
}
class sub2 extends parent{
	@Override
	public void message() {
		System.out.println("This is second subclass");
	}
}
public class program38 {

	public static void main(String[] args) {
		sub s = new sub();
		s.message();
		
		sub2 s2 = new sub2();
		s2.message();
	}

}

package javaprogram1;

class xyz{
	void num(int a) {
		if(a<18){
			throw new ArithmeticException("You are not eligible....");
		}else {
			System.out.println("you are eligible..");
		}
	}
}

public class program41 {

	public static void main(String[] args) {
		xyz r = new xyz();
		try {
			r.num(15);	
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

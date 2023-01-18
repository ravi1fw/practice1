package javaprogram1;

class cons{
	int a;
	int b;
	String str;
	
	cons (){
		this.a=10;
		this.b=34;
		this.str="ravi";
	}
	cons(int num1, int num2,String str1){
		this.a=num1;
		this.b=num2;
		this.str=str1;
	}
	void display() {
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.str);
	}
}
public class program36 {

	public static void main(String[] args) {
	cons ex1 = new cons();
	cons ex2 = new cons(2,3,"ravi");
	ex1.display();
	ex2.display();
	}

}

package javaprogram1;

@FunctionalInterface
interface apple{
	public String show(double a , double b); 
}
public class program59 {

	public static void main(String[] args) {
		
		apple obj = (a,b) ->{
			double result;
			result=a+b;
			return "Addition:- "+result;
					};
					
	System.out.println(obj.show(12.3,56.4));
	}

}

package StreamApi;
@FunctionalInterface
interface Apple<T,T1>{
	void processMethod(T a, T1 b);
}
public class example1 {

	public static void main(String[] args) {
		Apple<Double,Double> obj1=(a,b)->System.out.println(a+b);
		Apple<String,Double> obj2=(a,b)->System.out.println(a+" "+b);
		
		obj1.processMethod(10.34, 56.44);
		obj2.processMethod("java Stream API", 56.44);

	}

}
/*
 
 
*/
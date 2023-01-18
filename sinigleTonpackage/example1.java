package sinigleTonpackage;

class abc{
//	static abc obj = new abc();
	static abc obj;
	
	private abc() {
		System.out.println("This is a singleton desgin pattern");
	}
	
	public static abc getInstance() {   
		
		obj=new abc();			
		return obj;
	}
}
/*
 creation:-
 1.singletone design pattern:- 
 	1.it created one instance of the class
 	2.class ke andar object banana hai static object
 	3.constructor call krna hai vo bhi private 
 	4.ek static method banana hai class ke naam ka
 	5.methods ke andar obj ko return krna hai
 	
 2.factory design pattern
 3.prototype design pattern
 
 structural:-
 1.decorator design pattern
 2.facade design pattern
 
 behaviour:-
 1.chain of responsibility design pattern
 2.Iterator design pattern
 */
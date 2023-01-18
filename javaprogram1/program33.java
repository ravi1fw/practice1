package javaprogram1;

class student1{
	
	static String name;
	static int roll_no;
	static String city;
	static long pincode;
	
	static void details(){
		name="Ravi";
		roll_no=23;
		city="Nagpur";
		pincode=440016;
	}
	
	static void show_details() {
		System.out.println("The name of the student is:- "+name);
		System.out.println("The Roll number of the student is:- "+roll_no);
		System.out.println("The city of the student is:- "+city);
		System.out.println("The pin-code of the student is:- "+pincode);
		
	}
}
public class program33 {

	public static void main(String[] args) {
//		student1 stu =new student1();
//		stu.details();
//		stu.show_details();
		student1.details();
		student1.show_details();
	}

}

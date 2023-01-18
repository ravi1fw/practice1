//create a class named 'student' with string variable 'name' and integer variable 'roll-no'.
//assign value of roll_no as 2 and that of name as 'john' by creating an object of the class student

package javaprogram1;

class student{
	String name;
	int roll_no;	
}
public class program2 {
	public static void main(String [] args) {
		student stu = new student();
		stu.name="john";
		stu.roll_no=2;
		System.out.println("Name:- "+stu.name+"\nRoll no:- "+stu.roll_no);
		} 
}

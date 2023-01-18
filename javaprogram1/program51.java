/*write a program using hashmap and store coursename as key and course description as a value
  atleast 10 values display the Menu as Course List and Allow user to enter the course name and based on course 
  name print the description the program should also check to exit if your says yes then exit the program
  or else continue
 */

package javaprogram1;
import java.util.*;

public class program51 {

	public static void main(String[] args) {
		Map<String , String> books = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		books.put("Css", "Cascading Style Sheets (CSS) is a stylesheet language used to describe the presentation of a document written in HTML or XML");
		books.put("Html", "The HyperText Markup Language or HTML is the standard markup language for documents designed to be displayed in a web browser");
		books.put("Java", "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible.");
		books.put("CProgramming", "C is an imperative procedural language, supporting structured programming, lexical variable scope and recursion, with a static type system");
		books.put("Angular", "Angular is a development platform, built on TypeScript. As a platform, Angular includes: A component-based framework for building scalable web applications");
		books.put("C++", "C++ is a cross-platform language that can be used to create high-performance applications");
		books.put("Sql", "Structured query language (SQL) is a programming language for storing and processing information in a relational database.");
		books.put("Python", "Python is a multi-paradigm programming language. Object-oriented programming and structured programming are fully supported,");
		books.put("JavaScript", "JavaScript (JS) is a lightweight, interpreted, or just-in-time compiled programming language with first-class functions");
		books.put("TypeScript", "TypeScript is a free and open source programming language developed and maintained by Microsoft.");
	
		System.out.println(books.keySet());
		
		
		int num=0;
		do {
			System.out.println("please enter the course name:- ");
			String a = sc.nextLine();
			
		switch(a) {
		case "Css":
			System.out.println(books.get("Css"));
			break;
		case "Html":
			System.out.println(books.get("Html"));
			break;
		case "CPrograming":
			System.out.println(books.get("CPrograming"));
			break;
		case "Java":
			System.out.println(books.get("Java"));
			break;
		case "Angular":
			System.out.println(books.get("Angular"));
			break;
		case "C++":
			System.out.println(books.get("C++"));
			break;
		case "sql":
			System.out.println(books.get("sql"));
			break;
		case "Python":
			System.out.println(books.get("Python"));
			break;
		case "JavaScript":
			System.out.println(books.get("JavaScript"));
			break;
		case "TypeScript":
			System.out.println(books.get("TypeScript"));
			break;
			
		default:
			System.out.println("Sorry!!! these course is not in content");
		
		}
		System.out.println("\nIf you want to check again press 1 otherwise press 2");
		 num = sc.nextInt();
	}while(num==1);
	System.out.println("THanks For Checking..!!");
	}

}

package projects;
import java.util.*;
import java.io.*;

public class practice {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		File f = new File("practice.txt");
		FileWriter fos = new FileWriter(f);
		if(f.createNewFile()) {
			System.out.println("Enter the message:- ");
			String message;
			message=sc.nextLine();
			fos.write(message);			
		}else {
			System.out.println("file already exists");
		}
		fos.close();
	}
}

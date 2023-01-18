package Files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class printwriter {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("practice.txt");
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("ravi");
		pw.flush();
		pw.close();
	}

}
/*
constructor:- 
1.printWriter pw = new PrintWriter(String fname);
2.printWriter pw = new PrintWriter(File f);
3.printWriter pw = new PrintWriter(writer w);

methods:- 
1.write(int ch);
2.write(char[] ch);
3.write(String s);
4.flush
5.close();
 
*/
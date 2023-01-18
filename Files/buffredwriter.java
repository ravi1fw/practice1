package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffredwriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("practice.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch= {'a','b','c'};
		bw.write(ch);
		bw.newLine();
		bw.write("ravi");
		bw.newLine();
		bw.write("pandey");
		bw.flush();
		bw.close();

	}

}
/*
 constructors:- 
 1.BuffredWriter bw = new BufferWriter(Writer w);
 2.Buffredwriter bw = new BufferWriter(Writer w,int bufferSize);
 3.Buffredwriter bw = new BufferWriter(new Fw("abc.txt));
 3.Buffredwriter bw = new BufferWriter(new BufferedWriter(new Fw("abc.txt)));
 
 Methods :- 
 1.write(int ch):- to write single character to the
 2.write(char[] ch);
 3.write(String s); 
 4.flush();
 5.close();
 6.newLine();
*/
package Files;

import java.io.*;

public class filewriter {

	public static void main(String[] args) throws IOException {
	FileWriter fw= new FileWriter("practice.txt",true);
	fw.write(100);
	fw.write("\nRavi pandey\n");
	
	char [] ch= {'a','b','c','d'};
	fw.write(ch);
	fw.flush();
	fw.close();

	}

}
/*
FileWriter fw = new FileWriter(String name); using for overriding
FileWriter fw = new FileWriter(File f); using for overriding
FileWriter fw = new FileWriter(String fname,boolean append); using for append
FileWriter fw = new FileWriter(File f,boolean append); using for append

 
 Methods of fileweiter:-
1.write(int ch); write a sigle character to tha file
2.write(char[] ch);
3.write(string s);
4.flush();
5.close(); 
 
 
 
 
 */

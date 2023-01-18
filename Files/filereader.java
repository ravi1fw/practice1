package Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("practice.txt");
		int i = fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
	}

}
/*
to read the character data text data from the file
constructors:- 
1.FileReader fr = new FileReader(String fname); 
2.FileReader fr = new FileReader(File f); 

methods:- 
1.int read();
2.int read(char[] ch);
3.void close();

 */
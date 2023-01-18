package Files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class buffredreader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("practice.txt"));
		String line=br.readLine();
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}

}
/*
 constructors:- 
 1.BufferedReader br = new BufferedReader(Reader R);
 2.BufferedReader br = new BufferedReader(Reader R,int bufferSize);
 
 methods:- 
 1.int read();
 2.int read(char[] ch);
 3.void close();
 4.String newLine();
 */
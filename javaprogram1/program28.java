package javaprogram1;

public class program28 {

	public static void main(String[] args) {
		String str = "abcsb123sbxyz";
		String arr[]=str.split("sb");
		for(String s : arr) {
			System.out.println(s);
		}
	}

}

package javaprogram1;

public class program10 {
	public static void main(String[] args) {
		 int a[][]= {{1,2,3,4,5},{23,34,45,12,34}};
		 int b[][]= {{51,62,773,64,25},{223,3445,4545,412,334}};
		 int c[][][]= {
				 {
					 {1,2,3,4,5},
					 {23,34,45,12,34}
				 },
				 {
					 {51,62,773,64,25},
					 {223,3445,4545,412,334}
				 }
		 };
		 for(int k[][]:c) {
			 for(int i[]:k) {
				 for(int j:i) {
					 System.out.print(j+" ");
				 }
				 System.out.println();
			 }
		 }
	}
}

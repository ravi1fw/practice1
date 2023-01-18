//Write a Java program to find the duplicate values of an array of string values.
package javaprogram1;
public class program20 {

	public static void main(String[] args) {
		String[] my_array = {"bcd", "abd", "rav", "bcd", "oiu", "rav", "oiu"};
		 
        for (int i = 0; i < my_array.length; i++)
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if( (my_array[i].equals(my_array[j])) )
                {
                    System.out.println("Duplicate Element is : "+my_array[j]);
                }
            }
        }
	}

}

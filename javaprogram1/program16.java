//Write a program that generates a random number and asks the user to
//guess what the number is. If the user's guess is higher than the random
//number, the program should display "Too high, try again." If the user's guess
//is lower than the random number, the program should display "Too low, try
//again." The program should use a loop that repeats until the user correctly
//guesses the random number.

package javaprogram1;
import java.util.Random;

class game{
	int number;
	game(){
		Random rand = new Random();
        this.number = rand.nextInt(100);
	}
}
public class program16 {
public static void main(String[] args) {
	do {
		game g = new game();
		System.out.println("Enter the ");
	}while(23<34);	
}
}

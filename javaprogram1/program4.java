//create a class that captures airline ticket lists the departure and arrival cities a flight number and a seat 
//assignment make two examples of tickets.

package javaprogram1;

import java.util.Scanner;

class ticket{
	String departure;
	String arrivals;
	int flight_number;
	int seat_assignment;
//	
//	ticket(String departure, String arrivals,int flight_number,int seat_assignment){
//		this.departure=departure;
//		this.arrivals=arrivals;
//		this.flight_number=flight_number;
//		this.seat_assignment=seat_assignment;
//	}
	void putTicket() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Departure City:- ");
		this.departure=sc.nextLine();
		System.out.println("Enter the Arrival City:- ");
		this.arrivals=sc.nextLine();
		System.out.println("Enter the Flight number:- ");
		this.flight_number=sc.nextInt();
		System.out.println("Enter the Seat assignment:- ");
		this.seat_assignment=sc.nextInt();
	}
	void showTicket(){
		System.out.println("Departure City:- "+departure);
		System.out.println("Arrivals City:- "+arrivals);
		System.out.println("Flight number:- "+flight_number);
		System.out.println("Seat assignment:- "+seat_assignment);
	}
}
public class program4 {

	public static void main(String[] args) {
		ticket tc= new ticket();
		tc.putTicket();
		tc.showTicket();
		ticket tc1 = new ticket();
		tc1.putTicket();
		tc1.showTicket();
	}

}

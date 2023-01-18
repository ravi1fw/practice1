package javaprogram1;

import java.util.Scanner;

public class program29 {
	
	public static void chckBal() {
		System.out.println("Check Balance Activated..");
	}

	public static void deposit() {
		System.out.println("Deposit Done..");
	}

	public static void withdrawl() {
		System.out.println("Amount Withdrawal..");
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Press 1 for check Balance \n press 2 for withdrawal \n press 3 for "
				+ "deposit\n");
		System.out.println("Enter Your Choice what u want to do:- ");
		int user = sc.nextInt();
		switch(user) {
			case 1:{
				chckBal();
				break;
			}
			case 2:{
				 withdrawl();
				 break;
			}
			case 3:{
				deposit();
				break;
			}
			default:{
				System.out.println("Wrong Choice");
			}
		}

	}

}
//access-specifier:- 
//public,private and protected (mandotory)
//static(optional) 
//return-type(data-type) 
//function-name(parameters-list)
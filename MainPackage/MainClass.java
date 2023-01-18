package MainPackage;
import java.util.Scanner;

import ModuleDemoPackage.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeModule obj = new EmployeeModule();
		obj.setEmployeeName(sc.nextLine());
		obj.setEmployeeAge(sc.nextInt());
		
		obj.showDetails();
		
		
	}

}

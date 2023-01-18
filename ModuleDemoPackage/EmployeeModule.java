package ModuleDemoPackage;

import java.util.Scanner;

import ProjectInterfaces.Employees;

public class EmployeeModule implements Employees{
	public String EmployeeName="";
	public int EmployeeAge=0;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void showDetails() {
		System.out.println("Employee name:- "+EmployeeName);
		System.out.println("Employee Age:- "+EmployeeAge);
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeAge() {
		return EmployeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
}

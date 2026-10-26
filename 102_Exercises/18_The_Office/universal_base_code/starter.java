/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee nicole = new Employee(3248, "Nicole", "Iknadossian", 400000);

		dwight.raiseSalary(5);
		jim.raiseSalary(10);
		michael.raiseSalary(10);
		pam.raiseSalary(20);
		nicole.raiseSalary(500);

		double DwightAnnual=dwight.getAnnualSalary();
		double JimAnnual=jim.getAnnualSalary();
		double MichaelAnnual=michael.getAnnualSalary();
		double PamAnnual=pam.getAnnualSalary();
		double NicoleAnnual=nicole.getAnnualSalary();

		System.out.println("Michael's Annual Salary: " + MichaelAnnual);
		michael.employeeToString();
		System.out.println("Dwight's Annual Salary: " + DwightAnnual);
		dwight.employeeToString();
		System.out.println("Pam's Annual Salary: " + PamAnnual);
		pam.employeeToString();
		System.out.println("Jim's Annual Salary: " + JimAnnual);
		jim.employeeToString();
		System.out.println("Nicole's Annual Salary: " + NicoleAnnual);
		nicole.employeeToString();
		

		
	}
}

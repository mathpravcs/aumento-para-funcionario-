package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Employee emp = new Employee ();
		
		System.out.println("Name :");
		emp.name = sc.nextLine();
		System.out.printf("Gross Salary: ");
		emp.grossSalary = sc.nextDouble();
		System.out.printf("Tax : ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee" + emp);
		System.out.println();
		
		System.out.println(" Wicth the percentage to increase to salary: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary( percentage );
		
		System.out.println();
		System.out.println("Updated data: " + emp);
		sc.close();
		
		

	}

}

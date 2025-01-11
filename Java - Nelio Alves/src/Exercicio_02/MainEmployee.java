package Exercicio_02;

import java.util.Scanner;

public class MainEmployee {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee e = new Employee();
		System.out.println("Name: ");
		e.setName(sc.nextLine());
		System.out.println("Gross Salary: ");
		e.setGrossSalary(sc.nextDouble());
		System.out.println("Tax: ");
		e.setTax(sc.nextDouble());

		System.out.println(e.toString());
		System.out.println("\nWhich percentage to increase salary?");
		double percentual = sc.nextDouble();
		e.IncreaseSalary(percentual);
		
		System.out.println("Updated Data: " + e.toString());

		sc.close();
	}
}

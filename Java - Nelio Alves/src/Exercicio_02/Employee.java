package Exercicio_02;

public class Employee {

	private String name;
	private double GrossSalary;
	private double Tax;

	public double NetSalary() {
		return GrossSalary - Tax;
	}

	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage/100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(double tax) {
		Tax = tax;
	}

	public String toString() {
		return "Employee: " + name + "," + " $ " + NetSalary();
	}

}

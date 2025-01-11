package Exercicio_03;

import java.util.Scanner;

public class MainStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("Name: ");
		student.name = sc.nextLine();
		System.out.println("Grade 1:");
		student.grade1 = sc.nextInt();
		System.out.println("Grade 2:");
		student.grade2 = sc.nextInt();
		System.out.println("Grade 3:");
		student.grade3 = sc.nextInt();	
		
		
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}

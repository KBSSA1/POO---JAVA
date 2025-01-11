import java.util.Scanner;

public class NomesComparados {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String nome1, nome2;
		
		System.out.println("Informe um nome: ");
		nome1 = leitor.nextLine();
		System.out.println("Informe outro nome: ");
		nome2 = leitor.nextLine();
		
		while(nome1.equals(nome2)) {
			
			System.out.println("Os nomes devem ser diferentes");
			System.out.println("Informe um nome: ");
			nome1 = leitor.nextLine();
			System.out.println("Informe outro nome: ");
			nome2 = leitor.nextLine();
		}
		
		System.out.println("Na ordem alfabetica ....");
		if (nome1.compareTo(nome2) < 0) {
			System.out.println("O nome " + nome1 + " vem antes de " + nome2);
		} else {
			System.out.println("O nome " + nome2 + " vem antes de " + nome1);
			
		}
	}
}

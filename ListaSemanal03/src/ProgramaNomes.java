import java.util.Scanner;

public class ProgramaNomes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um nome:");
		String nome1 = leitor.nextLine();
		System.out.println("Informe outro nome:");
		String nome2 = leitor.nextLine();
		
		if (nome1.equals(nome2)) {
			System.out.println("nomes iguais"); 
		}else {
			System.out.println("nomes diferentes");			
		}
		
		leitor.close();

	}

}

import java.util.Scanner;

public class ProgramaNomes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Usuario, informe um nome");
		String nome1 = leitor.nextLine();
		System.out.println("Usuario, informe um segundo nome");
		String nome2 = leitor.nextLine();
		
		System.out.println("O primeiro nome informado foi: " + nome1);
		System.out.println("O segundo nome informado foi: " + nome2);
		
		if (nome1.equals(nome2)) {
			System.out.println("Os nomes sao iguais");
		}else {
			System.out.println("Os nomes sao diferentes");
		}
		
	}
	
}

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite o um nome: ");
		String primeiroNome = leitor.nextLine();

		String segundoNome;
		do {
			System.out.print("Digite o outro nome: ");
			segundoNome = leitor.nextLine();
			if (primeiroNome.equals(segundoNome)) {
				System.out.println("Esse nome ja foi fornecido");
			}
		} while (segundoNome.equals(primeiroNome));

		if (primeiroNome.compareTo(segundoNome) < 0) {
			System.out.println("Os nomes em ordem alfabética são: " + primeiroNome.toUpperCase() + " | "
					+ segundoNome.toUpperCase());
		} else {
			System.out.println("Os nomes em ordem alfabética são: " + segundoNome.toUpperCase() + " | "
					+ primeiroNome.toUpperCase());
		}

		leitor.close();
	}

}

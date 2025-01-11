import java.util.Scanner;

public class ProgramaMes {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o nome do mês por extenso: ");
		String mes = leitor.nextLine();

		int dias = 0;
		switch (mes.toLowerCase()) {
		case "janeiro":
		case "marco":
		case "maio":
		case "julho":
		case "agosto":
		case "outubro":
		case "dezembro":
			dias = 31;
			break;
		case "abril":
		case "junho":
		case "setembro":
		case "novembro":
			dias = 30;
			break;
		case "fevereiro":
			dias = 28;
			break;
		default:
			System.out.println("Mês inválido!");
		}

		if (dias > 0) {
			System.out.println("O mês de " + mes + " tem " + dias + " dias.");
		}

		leitor.close();
	}

}

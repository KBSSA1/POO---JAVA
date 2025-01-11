import java.util.Scanner;

public class AgendaDeContatos {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Contato[] agenda = new Contato[5];

		for (int i = 0; i < agenda.length; i++) {

			agenda[i] = new Contato();

			System.out.println("Nome: ");
			agenda[i].setNome(leitor.nextLine());

			System.out.println("Telefone: ");
			agenda[i].setTelefone(leitor.nextLine());

			System.out.println("Tipo: ");
			Tipo tipo = Tipo.valueOf(leitor.nextLine());
			agenda[i].setTipo(tipo);

		}

		int posicao = 0;

		while (posicao != -1) {
			System.out.println("Digite uma posicao: ");
			posicao = Integer.parseInt(leitor.nextLine());
			if (posicao >= 0 && posicao < agenda.length) {
				System.out.println(agenda[posicao].getNome() + " - " + agenda[posicao].getTelefone());
			} else if (posicao != -1) {
				System.out.println("Posicao invalida ...");
			}

		}
		String fixos = "Fixo: ";
		String celulares = "Celular: ";
		for (Contato i : agenda) {
			if (i.getTipo() == Tipo.FIXO) {
				fixos += i.getNome() + ", ";
			} else {
				celulares += i.getNome() + ", ";
			}
		}
		System.out.println(fixos);
		System.out.println(celulares);

		System.out.println("---F-I-M---D-E---P-R-O-G-R-A-M-A---");

	}
}

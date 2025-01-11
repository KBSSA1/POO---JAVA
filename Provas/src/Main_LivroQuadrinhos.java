import java.util.Scanner;

public class Main_LivroQuadrinhos {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Usuário, você quer cadastrar Livro ou Quadrinho");
		String escolha = leitor.nextLine().toUpperCase();

		try {
			if (escolha.equals("LIVRO")) {

				System.out.println("Qual o titulo do Livro: ");
				String titulo = leitor.nextLine();

				System.out.println("Qual o autor do Livro: ");
				String autor = leitor.nextLine();

				int anoPubli;

				while (true) {
					try {

						System.out.print("Ano de publicação: ");
						anoPubli = Integer.parseInt(leitor.nextLine());
						break;

					} catch (NumberFormatException e) {
						System.out.println("Ano de publicação inválido. Tente novamente.");
					}
				}

				Livro livro = new Livro(titulo, anoPubli, autor);
				System.out.println(livro.toString());

			} else if (escolha.equals("QUADRINHO")) {

				System.out.print("Título: ");
				String titulo = leitor.nextLine();

				System.out.print("Autor: ");
				String autor = leitor.nextLine();

				System.out.print("Desenhista: ");
				String desenhista = leitor.nextLine();

				int anoPubli;

				while (true) {
					try {

						System.out.print("Ano de publicação: ");
						anoPubli = Integer.parseInt(leitor.nextLine());
						break;

					} catch (NumberFormatException e) {
						System.out.println("Ano de publicação inválido. Tente novamente.");
					}
				}

				Livro quadrinho = new Quadrinho(titulo, anoPubli, autor, desenhista);
				System.out.println(quadrinho.toString());

			} else {

				System.out.println("Tipo inválido!");
			}

		} catch (AnoInvalidoExeception e) {
			System.out.println("ERRO - " + e.getMessage());

		}

		leitor.close();
	}
}

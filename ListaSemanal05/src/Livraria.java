import java.util.Scanner;

public class Livraria {

	private Livro[] estoque = new Livro[100];
	private int quatidadeDeLivrosCadastrados = 0;
	private float saldoDoCaixa = 0;

	public Livro[] getEstoque() {
		return estoque;
	}

	public int getQuatidadeDeLivrosCadastrados() {
		return quatidadeDeLivrosCadastrados;
	}

	public float getSaldoDoCaixa() {
		return saldoDoCaixa;
	}

	public boolean cadastraLivro(Livro livro) {

		// verifica se existe livro com mesmo titulo e nao deixa cadastrar
		for (int i = 0; i < quatidadeDeLivrosCadastrados; i++) {
			if (estoque[i].getTitulo().equals(livro.getTitulo())) {
				return false;
			}
		}

		// procura a proxima posicao no vetor para cadastrar o livro
		int posicaoDisponivel = -1;
		for (int i = 0; i < estoque.length; i++) {
			if (estoque[i] == null) {
				posicaoDisponivel = i;
				break;
			}
		}

		if (posicaoDisponivel == -1) {
			return false; // nao tem espaco disponivel no vetor
		} else {
			// cadastra o livro
			estoque[posicaoDisponivel] = livro;
			quatidadeDeLivrosCadastrados++;
			return true;
		}

	}

	public String compraLivro(String string) {

		// buscar livro no estoque
		Livro livro = new Livro();
		for (int i = 0; i < quatidadeDeLivrosCadastrados;) {
			if (estoque[i].getTitulo().equals(livro.getTitulo())) {
			}
			livro = estoque[i];
			break;
		}

		// verifica se encontrou o livro

		if (livro == null) {
			return "LIVRO NAO ENCONTRADO";
		}

		// verifica a quantidade disponivel para venda
		if (livro.getQuantidade() <= 0) {
			return "LIVRO ESGOTADO";
		}

		// atualiza a quantidade disponivel e o saldo do caixa
		livro.setQuantidade(livro.getQuantidade() - 1);
		saldoDoCaixa += livro.getPreco();
		return "LIVRO COMPRADO COM SUCESSO";
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Livraria livraria = new Livraria();
		int opcao = 0;

		while (opcao != 5) {

			System.out.println("MENU:");
			System.out.println("1 - Cadastrar novo livro no estoque");
			System.out.println("2 - Listar estoque");
			System.out.println("3 - Vender Livro");
			System.out.println("4 - Consultar caixa da Livraria");
			System.out.println("5 - Encerrar Programa");

			System.out.println("Digite a opcao desejada:");
			opcao = Integer.parseInt(leitor.nextLine());

			switch (opcao) {
				case 1: {
	
					Livro novoLivro = new Livro();
	
					System.out.println("Digite o titulo do livro:");
					String esseTitulo = leitor.nextLine();
					novoLivro.setTitulo(esseTitulo);
	
					System.out.println("Digite o ano de publicacao:");
					novoLivro.setAnoDePublicacao(leitor.nextInt());
	
					System.out.println("Digite a quantidade de livros:");
					novoLivro.setQuantidade(leitor.nextInt());
	
					System.out.println("Digite o preco deste livro:");
					novoLivro.setPreco(leitor.nextFloat());
	
					livraria.cadastraLivro(novoLivro);
					break;
				}
				case 2: {
	
					System.out.println("ESTOQUE:");
	
					for (Livro livro : livraria.getEstoque()) {
						System.out.println(
								"Titulo: " + livro.getTitulo() + " - Quantidade Disponivel: " + livro.getQuantidade());
					}
					break;
				}
				case 3: {
	
					System.out.println("Digite o titulo do livro que deseja comprar: ");
					String tituloComprado = leitor.nextLine();
					livraria.compraLivro(tituloComprado);
					break;
				}
				case 4: {
	
					System.out.println("CAIXA DA LIVRARIA: R$" + livraria.getQuatidadeDeLivrosCadastrados());
					break;
				}
				case 5: {
	
					System.out.println("Programa Encerrado...");
				}
				default: 
					System.out.println("OPCAO INVALIDA!");
				
			}

			leitor.close();

		}
	}
}

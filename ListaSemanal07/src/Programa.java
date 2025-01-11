import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Pessoa[] listaPessoas = new Pessoa[5];

		int qtdSolteiros = 0;
		int qtdCasados = 0;
		int qtdSeparados = 0;
		int qtdViuvos = 0;
		int qtdErros = 0;

		for (int i = 0; i < listaPessoas.length; i++) {

			System.out.printf("Cadastro da pessoa %d:\n", i + 1);

			System.out.print("Nome: ");
			String nome = leitor.nextLine();

			System.out.print("Idade: ");
			int idade = Integer.parseInt(leitor.nextLine());
			

			EstadoCivil estadoCivil = null;
			do {
				System.out.print("Estado civil (SOLTEIRO, CASADO, SEPARADO, VIUVO): ");
				String estadoCivilStr = leitor.nextLine().toUpperCase();
				try {
					estadoCivil = EstadoCivil.valueOf(estadoCivilStr);
				} catch (IllegalArgumentException e) {
					System.out.println("Opção inválida. Tente novamente.");
				}
			} while (estadoCivil == null);

			Pessoa pessoa = new Pessoa(nome, idade, estadoCivil);

			boolean pessoaJaExiste = false;

			for (int j = 0; j < i; j++) {
				if (listaPessoas[j].equals(pessoa)) {
					System.out.println("Já existe uma pessoa cadastrada com esses dados. Cadastre outra pessoa.");
					pessoaJaExiste = true;
					qtdErros++;
					break;
				}
			}

			if (!pessoaJaExiste) {
				listaPessoas[i] = pessoa;
				if (estadoCivil == EstadoCivil.SOLTEIRO) {
					qtdSolteiros++;
				} else if (estadoCivil == EstadoCivil.CASADO) {
					qtdCasados++;
				} else if (estadoCivil == EstadoCivil.SEPARADO) {
					qtdSeparados++;
				} else {
					qtdViuvos++;
				}
			}
		}

		System.out.println("\nRelatório:");
		System.out.printf("Quantidade de solteiros: %d\n", qtdSolteiros);
		System.out.printf("Quantidade de casados: %d\n", qtdCasados);
		System.out.printf("Quantidade de separados: %d\n", qtdSeparados);
		System.out.printf("Quantidade de viuvos: %d\n", qtdViuvos);
		System.out.printf("Quantidade de erros: %d\n", qtdErros);

		System.out.println("\nLista de pessoas cadastradas:");
		for (Pessoa pessoa : listaPessoas) {
			if (pessoa != null) {
				System.out.println( pessoa.toString());
			}

		}

		leitor.close();

	}

}

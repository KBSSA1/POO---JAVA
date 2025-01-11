package impressoraOO;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Impressora impressora = new Impressora(0, 100);
		int totalPagsImpressas = 0;
		int opcao = 0;

		System.out.println("IMPRESSORA OO");
		System.out.println("\n1 - imprimir");
		System.out.println("2 - carregar papel na impressora");
		System.out.println("3 - trocar o toner da impressora");
		System.out.println("4 - sair");

		System.out.println("\nDigite uma opcao: ");
		opcao = scanner.nextLine().charAt(0);

		boolean acabou = false;
		while (!acabou) {
			switch (opcao) {
				case '1': {
					System.out.println("Quantas paginas vao ser impressas: ");
					int pagsASeremImpressas = Integer.parseInt(scanner.nextLine());
					scanner.nextLine();
	
					try {
						int paginasImprimidas = impressora.imprimir(pagsASeremImpressas);
						totalPagsImpressas += paginasImprimidas;
						System.out.println("Foram impressas " + paginasImprimidas + " paginas");
	
					} catch (FaltouPapelException e) {
						System.out.println("Nao ha papel suficiente. Faltaram "  + e.getPaginasFaltando() + " paginas");
					} catch (FaltouTintaException e) {
						System.out.println("Nao ha tinta o suficiente para impressao");
					}
	
				}
	
				case '2': {
	
					System.out.println("Quantas paginas estao sendo adicionadas a impressora: ");
					int paginasCarregadas = Integer.parseInt(scanner.nextLine());
					
	
					impressora.setCargaToner(impressora.getQtdPags() + paginasCarregadas);
					System.out.println("Forma adicionadas " + paginasCarregadas + " na impresora");
					break;
	
				}
	
				case '3': {
	
					impressora.setCargaToner(100);
					System.out.println("O toner da impressora foi torcado e agora esta 100%");
					break;
				}
	
				case '4': {
	
					System.out.println("Quantidade de paginas na impressora: " + totalPagsImpressas);
					System.out.println("Quantidade de carga do toner da impressora: " + impressora.getCargaToner() + "%");
					acabou = true;
					break;
				}
				default: {
					System.out.println("opcao invalida!");
					break;
				}

			}// switch
		}//while
		
		scanner.close();

	}// main
}// class

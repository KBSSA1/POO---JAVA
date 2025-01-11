import java.util.Scanner;

public class MaquinaDeLavar {

	public int lavar(Roupa[] roupas) {

		int tempoTotal = 0;

		boolean temBranca = false;
		boolean temColorida = false;

		for (Roupa roupa : roupas) {
			if (roupa.getCor() == roupa.getCor().BRANCA) {
				temBranca = true;
			} else {
				temColorida = true;
			}

			if (temBranca && temColorida) {
				return -1;
			}
		}
		

		for (Roupa roupa2 : roupas) {
			int tempoDeLavagem = 0;

			switch (roupa2.getTamanho()) {

			case P:
				tempoDeLavagem += 3;
				break;
			case M:
				tempoDeLavagem += 5;
				break;
			case G:
				tempoDeLavagem += 8;
				break;
			}
			switch (roupa2.getCor()) {

			case BRANCA:
				tempoDeLavagem += 1;
				break;

			case COLORIDA:
				tempoDeLavagem += 2;
				break;
			}
			if (roupa2.getEstado() == roupa2.getEstado().SUJA) {
				tempoDeLavagem += 3;
			}

			tempoTotal += tempoDeLavagem;
			roupa2.setEstado(Estado.LIMPA);
		}
		
		
		return tempoTotal;
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Quantidade de roupas a serem lavadas: ");
		int quantidade = leitor.nextInt();

		Roupa[] roupas = new Roupa[quantidade];

		for (int i = 0; i < quantidade; i++) {

			System.out.println("\nRoupa #" + (i + 1));

			System.out.print("Cor (0 - branco / 1 - colorido): ");
			int cor = leitor.nextInt();

			System.out.print("Tamanho (0 - P / 1 - M / 2 - G): ");
			int tamanho = leitor.nextInt();

			System.out.print("Estado (0 - limpa / 1 - suja): ");
			int estado = leitor.nextInt();

			roupas[i] = new Roupa(Cor.values()[cor], Tamanho.values()[tamanho], Estado.values()[estado]);
		}

		System.out.println("\nAntes da lavagem:");
		for (int i = 0; i < quantidade; i++) {
			System.out.println("\nRoupa #" + (i + 1));
			System.out.println(roupas[i].toString());
		}

		System.out.println("\nLAVANDO ROUPAS ...");

		MaquinaDeLavar maquina = new MaquinaDeLavar();
		int tempo = maquina.lavar(roupas);

		System.out.println("\nDepois da lavagem:");
		System.out.println("");
		for (int i = 0; i < quantidade; i++) {
			System.out.println(roupas[i]);
		}
		System.out.println("\nTempo necessário para a lavagem: " + tempo + " minutos");
		leitor.close();
	}

}

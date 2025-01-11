import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantidade de linhas da matriz:");
		int linhas = leitor.nextInt();
		System.out.println("Quantidade de colunas da matriz:");
		int colunas = leitor.nextInt();

		int[][] matriz = new int[linhas][colunas];

		//System.out.println("Digite os elementos da matriz:");
		
		for (int i = 0; i < linhas; i++) {
			System.out.println("M:[" + matriz[linhas] + "," + matriz[colunas] + "]:");
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = leitor.nextInt();

			}
		}
		System.out.println("Soma dos elementos de cada linha da matriz:");
		for (int i = 0; i < linhas; i++) {
			int somaLinha = 0;
			for (int j = 0; j < colunas; j++) {
				somaLinha += matriz[i][j];
			}
			System.out.println("Linha " + (i + 1) + ": " + somaLinha);
		}
	}
}
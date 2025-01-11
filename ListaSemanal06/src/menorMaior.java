import java.util.Scanner;

public class menorMaior {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite uma sequencia de numeros separados por virgula:");
		String leitura = leitor.nextLine();

		String[] numerosLidos = leitura.split(",");
		int[] numeros = new int[numerosLidos.length];

		for (int i = 0; i < numerosLidos.length; i++) {
			numeros[i] = Integer.parseInt(numerosLidos[i].trim());
		}

		int maior = Integer.parseInt(numerosLidos[0]);
		int menor = Integer.parseInt(numerosLidos[0]);

		for (int i = 1; i < numeros.length; i++) {
			maior = Math.max(maior, Integer.parseInt(numerosLidos[i]));
			menor = Math.min(menor, Integer.parseInt(numerosLidos[i]));
		}

		System.out.println("O maior numero fornecido: " + maior);
		System.out.println("O menor numero fornecido: " + menor);

		leitor.close();

	}

}

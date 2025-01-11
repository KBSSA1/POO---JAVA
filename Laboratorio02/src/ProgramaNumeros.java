import java.util.Arrays;
import java.util.Scanner;

public class ProgramaNumeros {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[] listaDeNumeros = new int[10];

		System.out.println("Digite 10 numeros:");
		for (int i = 0; i < 10; i++) {
			listaDeNumeros[i] = leitor.nextInt();
		}
		System.out.println("Ordem original:");
		for (int i = 0; i < 10; i++) {
			System.out.print(listaDeNumeros[i] + ", ");
		}
		System.out.println("");
		System.out.println("Ordem inversa:");
		for (int i = 9; i >= 0; i--) {
			System.out.print(listaDeNumeros[i] + ", ");
		}
		System.out.println("");
		System.out.println("Os números ímpares:");
		for (int i = 0; i < 10; i++) {
			if (listaDeNumeros[i] % 2 != 0) {
				System.out.print(listaDeNumeros[i] + ", ");
			}
		}
		System.out.println("");
		System.out.println("Os números pares:");
		for (int i = 0; i < 10; i++) {
			if (listaDeNumeros[i] % 2 == 0) {
				System.out.print(listaDeNumeros[i] + ", ");
			}
		}
		System.out.println("");
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				soma += listaDeNumeros[i];
			}
		}

		System.out.println("A soma dos números nos índices ímpares é: " + soma);

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < 10; i++) {
			if (listaDeNumeros[i] > maior) {
				maior = listaDeNumeros[i];
			}
			if (listaDeNumeros[i] < menor) {
				menor = listaDeNumeros[i];
			}
		}

		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);

		System.out.println("Números em ordem crescente: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(listaDeNumeros[i] + ", ");
		}

		System.out.println();
		Arrays.sort(listaDeNumeros);
		
		
		// suposto metodo que imprimira a ordem decrescente
		/*Arrays.reverse(listaDeNumeros);

		System.out.println("Números em ordem decrescente: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(listaDeNumeros[i] + ", ");
		}*/
		leitor.close();
	}
}
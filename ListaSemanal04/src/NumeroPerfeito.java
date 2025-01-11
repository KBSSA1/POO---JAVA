import java.util.Scanner;

public class NumeroPerfeito {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			if (isPerfeito(i)) {
				System.out.println(i + " é um número perfeito. Soma dos divisores: " + somaDivisores(i));
			}
		}

		input.close();
	}

	public static boolean isPerfeito(int num) {
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		return sum == num;
	}

	public static int somaDivisores(int num) {
		int sum = 0;

		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}

		return sum;
	}
}

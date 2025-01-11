import java.util.Scanner;

public class CDF {
	
	public boolean ePerfeito(int n) {
		
		int num = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				num += i;
			}
		}
		
		return num == n;

	}

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		CDF cdf = new CDF();

		System.out.println("Digite um numero: ");
		int numero = leitor.nextInt();

		for (int i = 1; i <= numero; i++) {			
			if (cdf.ePerfeito(i)) {
				System.out.println(i);
			}
		}
	}
}

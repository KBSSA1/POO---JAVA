import java.util.Scanner;

public class HecaToDec {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("Informe um valor na base Hexadecimal:");
		String entrada = leitor.nextLine();
		
		int i = Integer.parseInt(entrada, 16);
		
		System.out.println(entrada);
		System.out.println(i);
		
		
		
		
		
	}
}

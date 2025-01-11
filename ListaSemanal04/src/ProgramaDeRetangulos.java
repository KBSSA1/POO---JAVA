import java.util.Scanner;

public class ProgramaDeRetangulos {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Retangulo r = new Retangulo();

		System.out.println("Qual a medida da base: ");
		r.setBase(leitor.nextInt());
		System.out.println("Qual a medida da altura: ");
		r.setAltura(leitor.nextInt());

		if (r.isQuadrada() == true) {
			System.out.println("É um quadrado");
		} else {
			System.out.println("Não é um quadrado");
		}

		r.autodesenhar();

	}
}
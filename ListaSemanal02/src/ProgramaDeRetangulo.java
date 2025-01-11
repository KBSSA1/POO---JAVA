import java.util.Scanner;

public class ProgramaDeRetangulo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();

		System.out.println("Informe os valores do retangulo...");
		System.out.println("Infomre o valor da base: ");
		retangulo.setBase(leitor.nextInt());
		System.out.println("Infomre o valor da altura: ");
		retangulo.setAltura(leitor.nextInt());

		System.out.println("Area do retangulo: " + retangulo.area());
		System.out.println("Perimetro do retangulo: " + retangulo.perimetro());

	}

}
 
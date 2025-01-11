import java.util.Scanner;

public class ProgramaDeTriangulos {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		String finish = "";

		int isosceles = 0;
		int equilatero = 0;
		int escaleno = 0;

		do {

			Triangulo t = new Triangulo();

			System.out.println("Informe o lado 1 do Triangulo: ");
			t.setLado1(Integer.parseInt(leitor.nextLine()));
			System.out.println("Informe o lado 2 do Triangulo: ");
			t.setLado2(Integer.parseInt(leitor.nextLine()));
			System.out.println("Informe o lado 3 do Triangulo: ");
			t.setLado3(Integer.parseInt(leitor.nextLine()));

			if (t.tipo() == TiposDeTriangulo.ISOSCELES) {
				isosceles++;
			} else if (t.tipo() == TiposDeTriangulo.EQUILATERO) {
				equilatero++;
			} else 
				escaleno++;

			System.out.println("Tem " + isosceles + " triangulos isosceles");
			System.out.println("Tem " + escaleno + " triangulos escaleno");
			System.out.println("Tem " + equilatero + " triangulos equilatero");

			System.out.println("Gotaria de informar outro triangulo? (sim/nao)");
			finish = leitor.nextLine();

		} while (finish.equals("sim"));
		 System.out.println("The End");
	}
}

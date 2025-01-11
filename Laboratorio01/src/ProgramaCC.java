import java.util.Scanner;

public class ProgramaCC {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		CalculadoraDeCalorias c = new CalculadoraDeCalorias();
		Pessoa p1 = new Pessoa();
		
		System.out.println("nome: ");
		p1.setNome(leitor.nextLine());
		System.out.println("sexo: (masculino ou feminino) ");
		p1.setSexo(leitor.nextLine());
		System.out.println("peso: ");
		p1.setPeso(leitor.nextFloat());
		System.out.println("altura: ");
		p1.setAltura(leitor.nextInt());
		System.out.println("idade: ");
		p1.setIdade(leitor.nextInt());
		
		System.out.println("Calculando ... ");
		System.out.println("Metabolismo Basal: " + c.calcularTaxaDeMetabolismoBasal(p1));
		
		
		
		
	}

}

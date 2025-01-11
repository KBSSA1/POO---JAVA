import java.util.Scanner;

public class CalculadoraDeCalorias {

	public static float calcularTaxaDeMetabolismoBasal(Pessoa p) {

		float TMBMulher = (float) (655.1 + (9.5 * p.getPeso()) + (1.8 * p.getAltura()) - (4.7 * p.getIdade()));
		float TMBHomem = (float) (66.5 + (13.8 * p.getPeso()) + (5 * p.getAltura()) - (6.8 * p.getIdade()));

		if (p.getSexo() == "feminino") {
			return TMBMulher;
		}
		return TMBHomem;
	}
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Scanner leitor = new Scanner(System.in);

		
		System.out.println("Calculadora de calorias: ");
		System.out.println("");
		
		System.out.println("Informe o seu nome: ");
		pessoa.setNome(leitor.nextLine());
		System.out.println("Informe o seu sexo (masculino/feminino): ");
		pessoa.setSexo(leitor.nextLine());
		System.out.println("Informe o seu peso: ");
		pessoa.setPeso(leitor.nextFloat());
		System.out.println("Informe o seu altura: ");
		pessoa.setAltura(leitor.nextInt());
		System.out.println("Informe o seu idade: ");
		pessoa.setIdade(leitor.nextInt());
		
		System.out.println("Sua taxa de metabolismo basal e de: " + CalculadoraDeCalorias.calcularTaxaDeMetabolismoBasal(pessoa));
		
		
		
		
		
		
		
		leitor.close();
		}
}
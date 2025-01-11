import java.util.Scanner;

public class ProgramaDoCarro {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Carro carro = new Carro();
		Planejador p = new Planejador();

		System.out.println("Qual o modelo do carro? ");
		carro.setModelo(leitor.nextLine());
		System.out.println("Qual a capacidade do tanque?");
		carro.setCapacidadeDeTanque(leitor.nextFloat());
		System.out.println("Qual a autonomia do carro?");
		carro.setAutonomia(leitor.nextFloat());
		System.out.println("Qual a distancia que sera percorrida?");
		int distancia = leitor.nextInt();

		System.out.println("Modelo do carro: " + carro.getModelo());
		System.out.println("Autonomia do carro: " + carro.getAutonomia() + "km/l");
		System.out.println("Capacidade do tanque do carro: " + carro.getCapacidadeDeTanque() + " litros");
		System.out.println("Distancia a ser percorrida:" + distancia + "km");
		System.out.println("Quantidade de abastecimentos: " + p.estimarAbastecimentos(carro, distancia));

	}
}

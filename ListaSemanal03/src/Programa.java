import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Paciente p = new Paciente();
		Nutricionista n = new Nutricionista();
		
		System.out.println("Qual a sua altura?");
		p.setAltura(leitor.nextFloat());
		System.out.println("Qual seus peso?");
		p.setPeso(leitor.nextFloat());
		
		System.out.println(n.avaliarIMC(p));
		
		leitor.close();
		
	}
}

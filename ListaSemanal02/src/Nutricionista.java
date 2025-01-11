import java.util.Scanner;

public class Nutricionista {

	public String avaliarIMC(Paciente p) {

		float imc = p.getPeso() / (p.getAltura() * 2);

		if (imc < 18.5) {
			return (imc + " ABAIXO DO PESO IDEAL, VAMOS MELHORAR");
		} else if ((imc > 18.5) && (imc < 24.9)) {
			return (imc + " PESO IDEAL, CONTINUE ASSIM");
		} else if ((imc > 25) && (imc < 29.9)) {
			return (imc + " VOCE ESTA SOBREPESO, VAMOS MELHORAR");
		} else if ((imc > 30) && (imc < 34.9)) {
			return (imc + " OBESIDADE I,CUIDADO");
		} else if (imc > 35) {
			return (imc + " OBESIDADE II, MUITO CUIDADO");
		}
		return (imc + " OBESIDADE III, VA AO MEDICO");
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Paciente pessoa = new Paciente();
		Nutricionista n = new Nutricionista();

		System.out.println("Vamos calcular seu Indice de Massa Corporea");

		System.out.println("Informe o seu peso atual:");
		pessoa.setPeso(leitor.nextFloat());
		System.out.println("Informe a sua altura atual:");
		pessoa.setAltura(leitor.nextFloat());
		String imc = (n.avaliarIMC(pessoa));

		System.out.println("Calculando ...");
		System.out.println("Seu IMC: " + imc);

	}// MAIN

}// CLASS

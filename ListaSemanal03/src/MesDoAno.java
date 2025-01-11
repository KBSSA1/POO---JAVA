import java.util.Scanner;

public class MesDoAno {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um mes: ");
		String mes = leitor.nextLine();

		switch (mes) {

		case "janeiro", "marco", "maio", "julho", "agosto", "outubro", "dezembro":
			System.out.println(mes.toUpperCase() + " TEM 31 DIAS");
			break;

		case "fevereiro":
			System.out.println("FEVEREITO TEM 28 OU 29 DIAS");
			break;

		default:
			System.out.println(mes.toUpperCase() + " TEM 30 DIAS");
			break;
		}
	}
}

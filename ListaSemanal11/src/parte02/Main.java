package parte02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite a primeira data (DD/MM/YYYY): ");
		String data1 = leitor.nextLine();
		String[] partesData1 = data1.split("/");
		int dia1 = Integer.parseInt(partesData1[0]);
		int mes1 = Integer.parseInt(partesData1[1]);
		int ano1 = Integer.parseInt(partesData1[2]);
		MinhaData minhaData1 = new MinhaData(dia1, mes1, ano1);

		System.out.print("Digite a segunda data (DD/MM/YYYY): ");
		String data2 = leitor.nextLine();
		String[] partesData2 = data2.split("/");
		int dia2 = Integer.parseInt(partesData2[0]);
		int mes2 = Integer.parseInt(partesData2[1]);
		int ano2 = Integer.parseInt(partesData2[2]);
		MinhaData minhaData2 = new MinhaData(dia2, mes2, ano2);

		int comparacao = minhaData1.comparacao(minhaData2);

		if (comparacao == 0) {
			System.out.println("As duas datas são iguais.");
		} else if (comparacao == 1) {
			System.out.println("A primeira data vem depois da segunda data.");
		} else if (comparacao == -1) {
			System.out.println("A primeira data vem antes da segunda data.");
		} else {
			System.out.println("Os objetos não são instâncias de MinhaData.");
		}
		
		leitor.close();
	}

}

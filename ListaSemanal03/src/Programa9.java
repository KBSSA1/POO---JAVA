import java.util.Scanner;

public class Programa9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Ponto ponto = new Ponto();
		Ponto ponto2 = new Ponto();

		System.out.println("Valor da cordenada X1: ");
		ponto.setX(leitor.nextInt());
		System.out.println("Valor da cordenada Y1: ");
		ponto.setY(leitor.nextInt());

		System.out.println("Valor da cordenada X2: ");
		ponto2.setX(leitor.nextInt());
		System.out.println("Valor da cordenada Y2: ");
		ponto2.setY(leitor.nextInt());

		System.out.println("X1 = " + ponto.getX());
		System.out.println("Y1 = " + ponto.getY());
		System.out.println("O primeiro ponto esta no " + ponto.quadrante());
		System.out.println("X2 = " + ponto2.getX());
		System.out.println("Y2 = " + ponto2.getY());
		System.out.println("O segundo ponto esta no " + ponto2.quadrante());

		if (ponto.eIgual(ponto2) == true) {
			System.out.println("Os dois pontos sao iguais");
		} else {
			System.out.println("Os dois pontos sao diferentes");
		}

		leitor.close();
	}

}

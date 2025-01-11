package Exercicio_01;
import java.util.Scanner;

public class MainRetangle {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);

		Retangle retangle = new Retangle();
		System.out.println("Enter rectangle width and height:");
		retangle.setWidth(sc.nextDouble());
		retangle.setHeight(sc.nextDouble());
		
		System.out.println("AREA:" + retangle.Area());
		System.out.println("PERIMETRO:" + retangle.Perimeter());
		System.out.println("DIAGONAL:" + retangle.Diagonal());
		sc.close();

	}

}

import java.util.Scanner;

public class ProgramaAlfandega {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		ProdutoImportado p = new ProdutoImportado();
		AgenteDeImportacao a = new AgenteDeImportacao();

		System.out.println("Qual produto o senhor(a) esta importando? ");
		p.setTipo(leitor.nextLine());
		System.out.println("Qual o valor que esta na nota?");
		p.setPreco(leitor.nextFloat());

		System.out.println("Produto importado: " + p.getTipo());
		System.out.println("Preco de bruto: " + p.getPreco());
		System.out.println("Preco convertido: " + a.converter(p));
		System.out.println("Preco com impostos: " + a.calcularImposto(p));
	}
}

import java.util.Scanner;

public class Coperativa {

	public static void main(String[] args) {

		ContaCorrente[] contasCorrentes = new ContaCorrente[100];
		ContaPoupanca[] contasPoupancas = new ContaPoupanca[100];

		Scanner leitor = new Scanner(System.in);
 
		int quantidadeContasCorrentes = 0;
		int quantidadeContasPoupancas = 0;
		int tipoConta;

		do {
			System.out.println("Cadastro de Contas da Cooperativa");
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Poupança");
			System.out.println("0 - Encerrar");
			System.out.print("Digite o tipo de conta desejado (1/2/0): ");
			tipoConta = leitor.nextInt();

			if (tipoConta == 1) {
				System.out.println("Cadastro de Conta Corrente");
				System.out.print("Digite o saldo: R$");
				float saldo = leitor.nextFloat();
				System.out.print("Digite o titular: ");
				String titular = leitor.nextLine();
				System.out.print("Digite o número: ");
				String numero = leitor.nextLine();
				System.out.print("Digite o valor do cheque especial: R$");
				float chequeEspecial = leitor.nextFloat();

				contasCorrentes[quantidadeContasCorrentes] = new ContaCorrente(saldo, titular, numero, chequeEspecial);
				quantidadeContasCorrentes++;

			} else if (tipoConta == 2) {
				System.out.println("Cadastro de Conta Poupança");
				System.out.print("Digite o saldo: R$");
				float saldo = leitor.nextFloat();
				System.out.print("Digite o titular: ");
				String titular = leitor.next();
				System.out.print("Digite o número: ");
				String numero = leitor.next();
				System.out.print("Digite a taxa de rendimento: ");
				float taxaRendimento = leitor.nextFloat();

				contasPoupancas[quantidadeContasPoupancas] = new ContaPoupanca(saldo, titular, numero, taxaRendimento);
				quantidadeContasPoupancas++;

			} else if (tipoConta == 0) {
				System.out.println("Cadastro encerrado.");
			} else {
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (tipoConta != 0);

		System.out.println("Quantidade de Contas Correntes cadastradas: " + quantidadeContasCorrentes);
		for (int i = 0; i < contasCorrentes.length; i++) {
			System.out.println(contasCorrentes[i].toString());
		}
		System.out.println("Quantidade de Contas Poupança cadastradas: " + quantidadeContasPoupancas);
		for (int i = 0; i < contasPoupancas.length; i++) {
			System.out.println(contasPoupancas[i].toString());
		}
		
		leitor.close();
	}
}

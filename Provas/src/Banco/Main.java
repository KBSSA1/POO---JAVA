package Banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Banco banco = new Banco();
		int opcao;

		while (true) {

			System.out.println("===== MENU =====");
			System.out.println("1 - Cadastrar uma conta poupança");
			System.out.println("2 - Cadastrar uma conta cheque especial");
			System.out.println("3 - Realizar um depósito em uma conta");
			System.out.println("4 - Realizar um saque em uma conta");
			System.out.println("5 - Consultar o saldo de uma conta");
			System.out.println("6 - Sair");

			System.out.print("Escolha uma opção: ");
			opcao = Integer.parseInt(leitor.nextLine());

			if (opcao == 6) {
				System.out.println("Saindo do programa...");
				break;
			}

			switch (opcao) {
			case 1:

				System.out.println("Número da conta: ");
				int numeroDaContaPoupanca = Integer.parseInt(leitor.nextLine());

				System.out.println("Saldo Inicial: ");
				float saldoPoupanca = leitor.nextFloat();
				leitor.nextLine();// so aqui no pc fazer isso

				try {
					ContaPoupanca contaPoupanca = new ContaPoupanca(numeroDaContaPoupanca, saldoPoupanca);
					banco.adicionarConta(contaPoupanca);
					System.out.println("Conta cadastrada com sucesso!");

				} catch (ContaDuplicadaException e) {
					System.out.println("ERRO ao cadastrar essa conta - " + e.getMessage());
				}
				break;

			case 2:

				System.out.println("Número da conta: ");
				int numeroDaContaChequeEspecial = Integer.parseInt(leitor.nextLine());

				System.out.println("Saldo Inicial: ");
				float saldoChequeEspecial = leitor.nextFloat();
				leitor.nextLine();// so aqui no pc fazer isso

				System.out.println("Limite de Cheque Especial: ");
				float limiteChequeEspecial = leitor.nextFloat();
				leitor.nextLine(); // so aqui no pc fazer isso

				try {
					ContaChequeEspecial contaChequeEspecial = new ContaChequeEspecial(numeroDaContaChequeEspecial,
							saldoChequeEspecial, limiteChequeEspecial);
					banco.adicionarConta(contaChequeEspecial);
					System.out.println("Conta cadastrada com sucesso!");

				} catch (ContaDuplicadaException e) {
					System.out.println("ERRO ao cadastrar conta cheque especial - " + e.getMessage());
				}
				break;

			case 3:

				System.out.print("Número da conta: ");
				int numeroContaDeposito = Integer.parseInt(leitor.nextLine());

				System.out.print("Valor do depósito: ");
				float valorDeposito = leitor.nextFloat();
				leitor.nextLine(); // Limpar o buffer do scanner

				try {

					banco.depositar(numeroContaDeposito, valorDeposito);
					System.out.println("Depósito realizado com sucesso!");

				} catch (ContaNaoEncontradaException | EntradaInvalidaException e) {
					System.out.println("Erro ao realizar depósito - " + e.getMessage());
				}
				break;

			case 4:

				System.out.print("Número da conta: ");
				int numeroContaSaque = Integer.parseInt(leitor.nextLine());

				System.out.print("Valor do saque: ");
				float valorSaque = leitor.nextFloat();
				leitor.nextLine(); // Limpar o buffer do scanner

				try {
					banco.sacar(numeroContaSaque, valorSaque);
					System.out.println("Saque realizado com sucesso!");

				} catch (ContaNaoEncontradaException | SaqueNaoPermitidoException | EntradaInvalidaException e) {
					System.out.println("Erro ao realizar saque - " + e.getMessage());
				}
				break;

			case 5:

				System.out.print("Número da conta: ");
				int numeroContaSaldo = Integer.parseInt(leitor.nextLine());

				try {

					float saldo = banco.consultarSaldo(numeroContaSaldo);
					System.out.println("Saldo da conta: " + saldo);

				} catch (ContaNaoEncontradaException e) {
					System.out.println("Erro ao consultar saldo: " + e.getMessage());
				}
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
				break;
			}

			System.out.println();
		}

		exibirContasCadastradas(banco);
		leitor.close();
	}

	private static void exibirContasCadastradas(Banco banco) {
		System.out.println("========================");
		System.out.println("===== CONTAS CADASTRADAS =====");
		System.out.println("========================");
		System.out.println("Contas Poupança:");
		System.out.println("========================");
		for (Conta conta : banco.getContas()) {
			if (conta instanceof ContaPoupanca) {
				System.out.println(conta.toString());
			}
		}
		System.out.println("========================");
		System.out.println("Contas Cheque Especial:");
		System.out.println("========================");
		for (Conta conta : banco.getContas()) {
			if (conta instanceof ContaChequeEspecial) {
				System.out.println(conta.toString());
			}
		}

	}
}

package Banco;

import java.util.List;
import java.util.ArrayList;

public class Banco {

	private List<Conta> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public void adicionarConta(Conta conta) throws ContaDuplicadaException {
		for (Conta c : contas) {
			if (c.getNumeroDaConta() == conta.getNumeroDaConta()) {
				throw new ContaDuplicadaException("Já existe uma conta com esse número informado.");
			}
		}
		contas.add(conta);
	}

	public void sacar(int numeroDaConta, float valor)
			throws ContaNaoEncontradaException, EntradaInvalidaException, SaqueNaoPermitidoException {
		Conta conta = buscarConta(numeroDaConta);
		conta.sacar(valor);
	}

	public void depositar(int numeroDaConta, float valor) throws ContaNaoEncontradaException, EntradaInvalidaException {
		Conta conta = buscarConta(numeroDaConta);
		conta.depositar(valor);
	}

	public float consultarSaldo(int numeroDaConta) throws ContaNaoEncontradaException {
		Conta conta = buscarConta(numeroDaConta);
		return conta.getSaldo();
	}

	public Conta buscarConta(int numeroDaConta) throws ContaNaoEncontradaException {
		for (Conta conta : contas) {
			if (conta.getNumeroDaConta() == numeroDaConta) {
				return conta;
			}
		}
		throw new ContaNaoEncontradaException("Conta não encontrada com o número informado.");
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

}
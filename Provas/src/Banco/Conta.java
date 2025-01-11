package Banco;

public abstract class Conta {

	private int numeroDaConta;
	private float saldo;

	public Conta(int numeroDaConta, float saldo) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void depositar(float valor) throws EntradaInvalidaException {
		if (valor <= 0) {
			throw new EntradaInvalidaException("O valor a ser depositado deve ser maior que zero.");
		}
		saldo += valor;
	}

	public abstract void sacar(float valor) throws EntradaInvalidaException, SaqueNaoPermitidoException;
}

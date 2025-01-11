package Banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numeroDaConta, float saldo) {
		super(numeroDaConta, saldo);

	}

	public void sacar(float valor) throws EntradaInvalidaException, SaqueNaoPermitidoException {
		if (valor <= 0) {
			throw new EntradaInvalidaException("O valor a ser sacado deve ser maior que zero.");
		}

		if (valor > getSaldo()) {
			throw new SaqueNaoPermitidoException("Saldo insuficiente para realizar um saque.");
		}

		setSaldo(getSaldo() - valor);
	}

	public String toString() {
		return "< ContaPoupanca > \nNumero Da Conta: " + getNumeroDaConta() + "\nSaldo: " + getSaldo();

	}

}

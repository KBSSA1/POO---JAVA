package Banco;

public class ContaChequeEspecial extends Conta {

	private float limiteCreditoEsecial;

	public ContaChequeEspecial(int numeroDaConta, float saldo, float limiteCreditoEspecial) {
		super(numeroDaConta, saldo);
		this.limiteCreditoEsecial = limiteCreditoEspecial;

	}

	public void sacar(float valor) throws EntradaInvalidaException, SaqueNaoPermitidoException {

		if (valor <= 0) {
			throw new EntradaInvalidaException("O valor a ser sacado deve ser maior que zero.");
		}

		if (valor > (getSaldo() + limiteCreditoEsecial)) {
			throw new SaqueNaoPermitidoException(
					"Valor de saque é maior que o saldo disponível e o limite de crédito especial.");
		}

		setSaldo(getSaldo() - valor);

	}

	public String toString() {
		return "< ContaPoupanca > \nNumero Da Conta: " + getNumeroDaConta() + "\nSaldo: " + getSaldo()
				+ "\nLimite Especial: " + limiteCreditoEsecial;

	}

}

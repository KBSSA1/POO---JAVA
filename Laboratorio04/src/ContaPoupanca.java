
public class ContaPoupanca {

	private float saldo;
	private String titular;
	private String numero;
	private float taxaRendimento;

	public ContaPoupanca(float saldo, String titular, String numero, float taxaRendimento) {
		this.saldo = saldo;
		this.titular = titular;
		this.numero = numero;
		this.taxaRendimento = taxaRendimento;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(float taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	public String toString() {
		return "Conta Poupança - Número: " + numero + ", Saldo: R$" + saldo;
	}

	public boolean equals(ContaPoupanca conta) {
		if (conta.getNumero().equals(this.numero)) {
			return true;
		}
		return false;
	}
}

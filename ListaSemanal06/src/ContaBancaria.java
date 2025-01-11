public class ContaBancaria {

	private float saldo;
	private String agencia;
	private String numero;
	private Pessoa titular;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria (Pessoa t, String a, String n, float s) {
		this.agencia = a;
		this.numero = n;
		this.saldo = s;
		this.titular = t;	
	}
	
	
	
}

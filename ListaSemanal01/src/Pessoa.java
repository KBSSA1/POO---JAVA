public class Pessoa {
	
	private String primeiroNomme;
	private String ultimoNome;
	private int anoDeNascimento;
	
	public void seApresentar() {
		System.out.println("Nome: " + primeiroNomme + ultimoNome);
		System.out.println("Ano de Nascimento: " + (2022 - anoDeNascimento));
	}
}

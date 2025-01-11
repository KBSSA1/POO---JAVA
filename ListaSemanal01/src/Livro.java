public class Livro {
	
	private String nome;
	private int anoDePublicacao;
	private Pessoa autor;
	
	public void obterReferencia () {
		System.out.println("Autor:" + autor);
		System.out.println("Livro:" + nome);
		System.out.println("Ano de Publicacao:" + anoDePublicacao);
	}
}

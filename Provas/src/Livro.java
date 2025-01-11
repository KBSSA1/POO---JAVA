import java.time.YearMonth;

public class Livro {

	private String titulo;
	private int anoPublicacao;
	private String autor;

	public Livro(String titulo, int anoPublicacao, String autor) throws AnoInvalidoExeception {
		if (anoPublicacao < 1900 || anoPublicacao > YearMonth.now().getYear()) {
			throw new AnoInvalidoExeception("Ano de publicação inválido");
		}

		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;

	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public boolean equals(Livro livro) {
		if (this.titulo.equals(livro.getTitulo())) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "--- L I V R O --- " + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: "
				+ anoPublicacao;
	}
}

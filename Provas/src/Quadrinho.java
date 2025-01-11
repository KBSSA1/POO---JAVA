
public class Quadrinho extends Livro {

	private String desenhista;

	public Quadrinho(String titulo, int anoPublicacao, String autor, String desenhista) throws AnoInvalidoExeception {
		super(titulo, anoPublicacao, autor);
		this.desenhista = desenhista;

	}

	public String getDesenhista() {
		return desenhista;
	}

	public void setDesenhista(String desenhista) {
		this.desenhista = desenhista;
	}

	public String toString() {
		return "--- Q U A D R I N H O --- " + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDesenhista: "
				+ desenhista + "\nAno de publicação: " + getAnoPublicacao();
	}

}

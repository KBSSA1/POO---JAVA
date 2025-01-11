
public class Roupa {

	private Cor cor;
	private Tamanho tamanho;
	private Estado estado;

	public Roupa(Cor cor, Tamanho tamanho, Estado estado) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.estado = estado;
	}

	public String toString() {
		return "Roupa [COR= " + cor + ", TAMANHO= " + tamanho + ", ESTADO= " + estado + "]";
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}

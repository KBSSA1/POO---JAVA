package question01;

public abstract class MensageiroPadrao implements Mensagem{
	
	private String texto;
	
	public MensageiroPadrao (String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}

}

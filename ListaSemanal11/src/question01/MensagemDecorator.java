package question01;

public abstract class MensagemDecorator implements Mensagem {

	protected Mensagem mensagemDecorada;

	public MensagemDecorator(Mensagem mensagemDecorada) {
		this.mensagemDecorada = mensagemDecorada;
	}

}

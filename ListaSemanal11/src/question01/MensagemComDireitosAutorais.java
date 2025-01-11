package question01;

public class MensagemComDireitosAutorais extends MensagemDecorator{
	
	public MensagemComDireitosAutorais(Mensagem mensagemDecorada) {
		super(mensagemDecorada);
	}
	
	public String getTexto() {
		return mensagemDecorada.getTexto().concat("... [DireitosReservados].");
	}

}

package question01;
public class Criptografia implements MensagemDecorator {
	
	private Mensagem  mensagem;
	
	public String getTexto() {
		return mensagem.getTexto().replace(" ", "*");
	}

}

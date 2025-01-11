package question01;

public class Mensageiro {

	public Mensagem prepararMensagem(String texto, String destino) {
		
		Mensagem mensagem = new Mensagem(texto);
		
		if(destino.equals("externo")) {
			mensagem = new Criptografia(mensagem);
			mensagem = new MensagemComDireitosAutorais(mensagem);
		}
		
		return mensagem;
	}
}

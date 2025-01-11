package question01;
public class Main {

	public static void main(String[] args) {

		Mensageiro mensageiro = new Mensageiro();

		String texto = "Exemplo de mensagem";
		String destino = "externo";

		Mensagem mensagem = mensageiro.prepararMensagem(texto, destino);
		System.out.println(mensagem.getTexto());
	}

}

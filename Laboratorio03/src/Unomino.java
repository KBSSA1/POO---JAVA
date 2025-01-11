
public class Unomino {
	public static void main(String[] args) {

		Jogo jogo = new Jogo();
		jogo.embaralharPecas();
		Domino daVez = jogo.puxarPeca();

		Domino[] mao = new Domino[6];
		for (int i = 0; i < mao.length; i++) {
			mao[i] = jogo.puxarPeca();
		}
		System.out.println("Peca da Vez: " + daVez);
		System.out.print("Peca da Mao: ");
		for (int i = 0; i < mao.length; i++) {
			System.out.print( mao[i].toString());

		}

	}

}

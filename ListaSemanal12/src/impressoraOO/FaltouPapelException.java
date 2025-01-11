package impressoraOO;

public class FaltouPapelException extends Exception {

	private int paginasFaltando;

	public FaltouPapelException(int paginasFaltando) {
		this.paginasFaltando = paginasFaltando;
	}

	public int getPaginasFaltando() {
		return paginasFaltando;
	}

}

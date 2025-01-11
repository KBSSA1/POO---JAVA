
public class Domino {

	private int ladoA;
	private int ladoB;

	public Domino(int ladoA, int ladoB) {
		setLadoA(ladoA);
		setLadoB(ladoB);
	}

	public int getLadoA() {
		return ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoA(int ladoA) {
		if (ladoA >= 0 && ladoA <= 6) {
			this.ladoA = ladoA;
		} else {
			System.out.println("Erro: O Valor do LadoA deve estar entre 0 e 6");
		}

	}

	public void setLadoB(int ladoB) {
		if (ladoB >= 0 && ladoB <= 6) {
			this.ladoB = ladoB;
		} else {
			System.out.println("Erro: O Valor do LadoA deve estar entre 0 e 6");
		}
	}

	public boolean validarJuncao(Domino outroDomino) {
		if (outroDomino.getLadoA() == this.ladoA || outroDomino.getLadoB() == ladoB) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "[" + ladoA + "," + ladoB + "]";
	}

}

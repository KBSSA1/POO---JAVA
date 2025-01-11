public class Jogo {

	private Domino[] pecas;
	private int indiceDaPecaAserPuxada = 0;

	public Jogo() {

		pecas = new Domino[28];
		int index = 0;

		for (int i = 0; i <= 6; i++) {
			for (int j = i; j <= 6; j++) {
				Domino peca = new Domino(i, j);
				pecas[index] = peca;
				index++;
			}
		}
	}

	public void embaralharPecas() {
		for (int i = 0; i < 100; i++) {

			int index1 = (int) (Math.random() * 28);
			int index2;

			do {
				index2 = (int) (Math.random() * 28);
			} while (index1 == index2);

			Domino temp = pecas[index1];
			pecas[index1] = pecas[index2];
			pecas[index2] = temp;
		}
		indiceDaPecaAserPuxada = 0;
	}

	public Domino puxarPeca() {
		if (indiceDaPecaAserPuxada < 28) {
			return pecas[indiceDaPecaAserPuxada++];
		} else {
			return null;
		}

	}

}

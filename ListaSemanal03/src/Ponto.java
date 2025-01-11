public class Ponto {

	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean eIgual(Ponto p) {
		if (x == p.getX() && y == p.getY()) {
			return true;
		}
		return false;
	}

	public String quadrante() {

		if (x > 0 && y > 0) {
			return "1º quadrante";
		} else if (x < 0 && y > 0) {
			return "2º quadrante";
		} else if (x < 0 && y < 0) {
			return "3º quadrante";
		} else if (x > 0 && y < 0) {
			return "4º quadrante";
		}
		return "O ponto esta na origem";

	}

}

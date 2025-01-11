public class Retangulo {

	private int base;
	private int altura;

	public int getBase() {
		return base;
	}

	public void setBase(int basee) {
		base = basee;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int alturaa) {
		altura = alturaa;
	}

	public int area() {
		return base * altura;
	}

	public boolean isQuadrada() {
		if (base == altura) {
			return true;
		}
		return false;
	}

	public boolean eIgual(Retangulo r) {
		if ((r.altura == altura) && (r.base == base)) {
			return true;
		}
		return false;
	}

	public void autodesenhar() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("O ");
			}
			System.out.println();
		}
	}
}

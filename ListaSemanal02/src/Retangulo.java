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

	public int perimetro() {
		return 2 * (base + altura);
	}

}

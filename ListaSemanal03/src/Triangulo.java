public class Triangulo {

	private int lado1;
	private int lado2;
	private int lado3;

	public int getLado1() {
		return lado1;
	}

	public void setLado1(int lado01) {
		lado1 = lado01;
	}

	public int getLado2() {
		return lado2;
	}

	public void setLado2(int lado02) {
		lado2 = lado02;
	}

	public int getLado3() {
		return lado3;
	}

	public void setLado3(int lado03) {
		lado3 = lado03;
	}

	public TiposDeTriangulo tipo() {
		if (lado1 == lado2 && lado1 == lado3) {
			return TiposDeTriangulo.EQUILATERO;
		} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
			return TiposDeTriangulo.ISOSCELES;
		}
		return TiposDeTriangulo.ESCALENO;
	}
}

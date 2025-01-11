public class Nutricionista {

	public ResultadoIMC avaliarIMC(Paciente p) {

		float imc = p.getPeso() / (p.getAltura() * p.getAltura());

		if (imc < 18.5) {
			return ResultadoIMC.BAIXO_PESO;

		} else if (imc < 25) {
			return ResultadoIMC.NORMAL;

		} else if (imc < 30) {
			return ResultadoIMC.SOBREPESO;
			
		} else {
			return ResultadoIMC.OBESIDADE;
		}
	}
}

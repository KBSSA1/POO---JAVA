public class Planejador {

	public int estimarAbastecimentos(Carro c, int distancia) {
		float a = (c.getAutonomia() * c.getCapacidadeDeTanque());
		double b = (double) distancia / a;
		return (int) Math.ceil(b);

	}
}

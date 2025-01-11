
public class Bicicleta extends VeiculoTerrestre {

	public Bicicleta() {
		System.out.println("Bicicleta criada!");
	}

	public void mover() {
		System.out.println("Andando de Bicicleta");
	}

	public void abastecer() {
		System.out.println("Não convem Abastecer");
	}
	
	public static void main(String[] args) {
		VeiculoTerrestre v = new Bicicleta();
		v.abastecer();
		v.mover();
	}
}

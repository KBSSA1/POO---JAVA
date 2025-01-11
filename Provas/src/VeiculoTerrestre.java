
public abstract class VeiculoTerrestre {

	public VeiculoTerrestre() {
		System.out.println("Criando Veiculo");
	}

	public abstract void mover();

	public void abastecer() {
		System.out.println("Abastecendo veiculo");
	}

}

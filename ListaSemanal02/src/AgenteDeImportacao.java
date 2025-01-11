public class AgenteDeImportacao {

	public float converter(ProdutoImportado pi) {

		float valorNovo = (float) (pi.getPreco() * 5.18);
		return valorNovo;
	}

	public float calcularImposto(ProdutoImportado pi) {
		return (float) (pi.getPreco() + (pi.getPreco() * 0.6));

	}
}

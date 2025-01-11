package impressoraOO;

public class Impressora {

	private int qtdPags;
	private float cargaToner;

	public Impressora(int qtdPags, float cargaToner) {

		this.qtdPags = qtdPags;
		this.cargaToner = cargaToner;
	}
	public int imprimir(int qtdPagsImpresssas) throws FaltouPapelException, FaltouTintaException {
		
		if (qtdPagsImpresssas > qtdPags) {
			throw new FaltouPapelException(qtdPagsImpresssas - qtdPagsImpresssas);
		}
		float tintaNecessaria =  qtdPagsImpresssas * 0.35f;
		if(tintaNecessaria > cargaToner) {
			throw new FaltouTintaException();
		}
		qtdPags -= qtdPagsImpresssas;
		cargaToner -= tintaNecessaria;
		
		return qtdPagsImpresssas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public int getQtdPags() {
		return qtdPags;
	}

	public void setQtdPags(int qtdPags) {
		this.qtdPags = qtdPags;
	}

	public float getCargaToner() {
		return cargaToner;
	}

	public void setCargaToner(float cargaToner) {
		this.cargaToner = cargaToner;
	}

	
	
}

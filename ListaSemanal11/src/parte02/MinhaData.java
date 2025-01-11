package parte02;

public class MinhaData implements ClasseComparavel {

	private int dia;
	private int mes;
	private int ano;

	public MinhaData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int comparacao(Object obj) {

		if (obj instanceof MinhaData) {
			MinhaData outraData = (MinhaData) obj;
			if (dia == outraData.getDia() && mes == outraData.getMes() && ano == outraData.getAno()) {
				return 0;
			} else if (ano < outraData.getAno() || (ano == outraData.getAno() && mes < outraData.getMes())
					|| (ano == outraData.getAno() && mes == outraData.getMes() && dia < outraData.getDia())) {
				return 1;
			} else {
				return -1;
			}

		}
		return -2;
	}

}

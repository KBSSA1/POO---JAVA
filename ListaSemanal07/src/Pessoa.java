
public class Pessoa {

	private String nome;
	private int idade;
	private EstadoCivil estadoCivil;

	public Pessoa(String nome, int idade, EstadoCivil estadoCivil) {
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;

	}

	public Pessoa() {
		nome = "desconhecido";
		idade = 5;
		estadoCivil = estadoCivil.SOLTEIRO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public boolean equals(Pessoa novaPessoa) {
		if (novaPessoa.getNome() == nome && novaPessoa.getIdade() == idade
				&& novaPessoa.getEstadoCivil().SOLTEIRO == estadoCivil.SOLTEIRO) {
			return true;
		}
		return false;

	}

	public String toString() {
		
		String faseDaVida = "";
			 
		if (idade <= 11) {
			faseDaVida = "Infancia";
		} else if (idade <= 20) {
			faseDaVida = "Adolescencia";
		} else if (idade <= 59) {
			faseDaVida = "Adulta";
		} else
			faseDaVida = "Velhice";
			        
		return "Nome: " + nome + "  Idade: " + idade + "  Fase de Vida: " + faseDaVida;
	}

}

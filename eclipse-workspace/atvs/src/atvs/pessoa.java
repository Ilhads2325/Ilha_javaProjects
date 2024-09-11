package atvs;

public class pessoa {
	private String nome;
	private int idade;

	public pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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
		if (idade > 0) {
			this.idade = idade;
		}
	}
}

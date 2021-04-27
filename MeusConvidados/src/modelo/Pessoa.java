package modelo;

/**
 * Determina que tipo de dados tera as pessoas(convidados) e são implementados atraves dos gets e sets
 * 
 * @author Lameque Fernandes
 * @versão 1.0 (Abril 2021)
 */

public abstract class Pessoa {

	protected int idade;
	protected long numTelefone;
	protected String nome;
	protected String sexo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public long getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(long numTelefone) {
		this.numTelefone = numTelefone;
	}

}

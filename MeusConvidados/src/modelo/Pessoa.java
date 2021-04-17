package modelo;

public abstract class Pessoa {
//apagar no futuro//////////////
	protected int idade;
	protected long numTelefone;
///////////////////////////////
	protected String nome;
	protected String idadee;
	protected String telefone;
	protected String sexo;
	protected String email;
	protected String endereco;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}

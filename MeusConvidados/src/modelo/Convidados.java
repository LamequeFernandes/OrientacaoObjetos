package modelo;

import java.util.Scanner;

public class Convidados extends Pessoa {

	// atributo
	private String tipoConvidado;
	private Status status;
	private int numConvidados;
	private String[] convidadosCadastrados = new String[30];
		
	Scanner ler = new Scanner(System.in);

	public Convidados() {}
	public Convidados(String nome, String idadee, String telefone, String sexo, String tipoConvidado) {
	}
	// gets e sets
	public int getNumConvidados() {
		return numConvidados;
	}

	public void setNumConvidados(int numConvidados) {
		this.numConvidados = numConvidados;
	}


	public String getTipoConvidado() {
		return tipoConvidado;
	}

	public void setTipoConvidado(String tipoConvidado) {
		this.tipoConvidado = tipoConvidado;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// gets e sets herdados

	public String getNome() {
		return nome;
	}

	public void setNome(String nome, int i) {
		this.convidadosCadastrados[i] = nome;
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
	
	// metodo para cadastrar convidados
	public void cadastrar() {
		System.out.println(" ");
		System.out.println("Digite a quantidade de convidados que deseja adicionar(maximo de 30): ");
		int pessoas = ler.nextInt();
		if (pessoas <= 30) {
			for (int contador = 0; contador < pessoas; contador++) {
				System.out.println(" ");
				System.out.println("Convidado " + (contador + 1) + ": ");
				System.out.print("Nome do Convidado: ");
				setNome(ler.nextLine(), contador);
				setNome(ler.nextLine(), contador);
				System.out.print("Tipo de convidado(exemplo: amigo, etc): ");
				setTipoConvidado(ler.nextLine());
				System.out.print("Idade do convidado: ");
				setIdade(ler.nextInt());
				System.out.print("Sexo do convidado: ");
				setSexo(ler.next());
				System.out.print("Telefone com DDD: ");
				setNumTelefone(ler.nextLong());

				System.out.println(" ");
				System.out.println("Convidado cadastrado com sucesso!");
				System.out.println("----------------------------------------------------------------------");

				setNumConvidados(pessoas);
			}
		}
	}
	//metodo para mostrar lista de convidados
	public void consultarConvidadosCadastrados() {
		System.out.println(" ");
		System.out.println("                 ------- Lista de convidados -------     ");
		System.out.println(" ");
		for (int i = 0; i < getNumConvidados(); i++) {
			System.out.println((i + 1) + "-" + convidadosCadastrados[i]);
		}
	}
}

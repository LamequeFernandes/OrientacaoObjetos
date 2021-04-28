package modelo;


import java.util.Scanner;

/**
 * Cria atributos para as tarefas que são implementadas atraves dos gets e sets
 * 
 * @version 1.0 (Abril 2021)
 * @author Lameque Fernandes
 */
public class Tarefas {
	
	//atributos
	private String descricaoTarefa;
	private String prioridadeTarefa;
	private Status status;
	private int numTarefas;
	private String[] tarefaCadastradas = new String[30];	

	Scanner ler = new Scanner(System.in);
	
	//construtor
	public Tarefas() {}	
	
	// gets e sets
	public int getNumTarefas() {
		return numTarefas;
	}

	public void setNumTarefas(int numTarefas) {
		this.numTarefas = numTarefas;
	}

	public String getDescricaoTarefa() {
		return descricaoTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa, int i) {
		this.tarefaCadastradas[i] = descricaoTarefa;
	}	

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String getPrioridadeTarefa() {
		return prioridadeTarefa;
	}

	public void setPrioridadeTarefa(String prioridadeTarefa) {
		this.prioridadeTarefa = prioridadeTarefa;
	}

	public void setDescricaoTarefa(String descricaoTarefa) {
		this.descricaoTarefa = descricaoTarefa;
	}

}

package modelo;

import java.util.Scanner;

public class Tarefas {
	
	//atributos
	private String descricaoTarefa;
	private int prioridadeTarefa;
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

	public int getPrioridadeTarefa() {
		return prioridadeTarefa;
	}

	public void setPrioridadeTarefa(int prioridadeTarefa) {
		this.prioridadeTarefa = prioridadeTarefa;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	//metodo para cadastrar tarefas
	public void cadastrar() {
		System.out.println(" ");
		System.out.println("Digite a quantidade de Tarefas que deseja adicionar ao Evento(max. 30): ");
		int tarefas = ler.nextInt();
		if (tarefas <= 30) {
			for (int contador = 0; contador < tarefas; contador++) {
				System.out.println(" ");
				System.out.println("Tarefa " + (contador + 1) + ": ");
				setDescricaoTarefa(ler.nextLine(), contador);
				setDescricaoTarefa(ler.nextLine(), contador);
				System.out.print("Prioridade, de 1 a 10: ");
				setPrioridadeTarefa(ler.nextInt());

				System.out.println(" ");
				System.out.println("Tarefa cadastrada com sucesso!");
				System.out.println("----------------------------------------------------------------------");

				setNumTarefas(tarefas);
			}
		} 
	}
	
	//metodo para mostrar lista de tarefas
	public void consultarGastosCadastrados() {
		System.out.println(" ");
		System.out.println("                 ------- Lista de Tarefas -------     ");
		System.out.println(" ");
		for (int i = 0; i < getNumTarefas(); i++) {
			System.out.println((i + 1) + "-" + tarefaCadastradas[i]);
		}
	}	
}

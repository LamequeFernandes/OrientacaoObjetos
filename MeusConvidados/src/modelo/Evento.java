package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Evento {

	//atributos
	private String nomeEvento;
	private String tipoEvento;
	private Status status;
	private String dataEvento;
	private String horarioInicio;
	private String anotacoes;
	private int parar;
//	private ArrayList<Convidados> listaConvidados = new ArrayList<Convidados>();
	
	
	//objetos instanciados 
	Scanner ler = new Scanner(System.in);
	Convidados convidados = new Convidados();
	Gastos gastos = new Gastos();
	Tarefas tarefa = new Tarefas();

	//construtores
	
	public Evento() {}

	public Evento(String nomeEvento, String tipoEvento, Status status, String dataEvento, String horarioInicio,
			String anotacoes, Convidados convidados) {
		this.nomeEvento = nomeEvento;
		this.tipoEvento = tipoEvento;
		this.status = status;
		this.dataEvento = dataEvento;
		this.horarioInicio = horarioInicio;
	}

	//gets e sets
	
	public int getParar() {
		return parar;
	}

	public void setParar(int parar) {
		this.parar = parar;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;

	}
	
	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public String getAnotacoes() {
		return anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}
	
	@Override
	public String toString() {
		return nomeEvento;
	}

	
}

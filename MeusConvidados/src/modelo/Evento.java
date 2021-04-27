package modelo;
/**
 * Defini os dados do evento implementado os gets e sets dos convidados
 * 
 * @versão 1.0 (Abril 2021)
 * @author lameque
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Evento {

	//atributos
	private String nomeEvento;
	private String tipoEvento;
	private Status status;
	private String dataEvento;
	private int horarioInicio;
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

	public Evento(String nomeEvento, String tipoEvento, Status status, String dataEvento, int horarioInicio,
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

	public int getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(int horarioInicio) {
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
	
	public boolean validaHorario(int horario) {
		boolean aux = true;
		setHorarioInicio(horario);
		if(getHorarioInicio() < 0) 
			aux = false;		
		
		if(getHorarioInicio() > 24) 
			aux = false;					
		
		return aux;
	}
	
}

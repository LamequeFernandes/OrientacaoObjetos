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

	// metodo para limpeza de tela
	public void limpaTela(int numLinhas) {
		for (int limpar = 0; limpar < numLinhas; limpar++)
			System.out.println(" ");
	}

	//metodo para printar na tela a inicializacao do programa
	public void inicializacaoMenu() {
		System.out.println("=====================================================================");
		System.out.println("                       | Olá, Seja Bem-vindo |");
		System.out.println("=====================================================================");
		System.out.println(" ");
		System.out.println("Para acessar o menu de EVENTO, digite: Evento");
	}

	//metodo para cadastrar o evento
	public void cadastrar() {
		System.out.print("Nome do Evento: ");
		setNomeEvento(ler.nextLine());
		setNomeEvento(ler.nextLine());
		System.out.print("Tipo do Evento: ");
		setTipoEvento(ler.nextLine());
		System.out.print("Digite, apenas o dia do Evento: ");
		int dia = ler.nextInt();
		System.out.print("Digite, apenas com numeros, o mes do Evento: ");
		int mes = ler.nextInt();
		System.out.print("Digite, apenas a HORA, que ocorrera o evento: ");
		setHorarioInicio(ler.nextLine());
		System.out.println("Campo p/adicionar anotacoes sobre o evento: ");
		setAnotacoes(ler.nextLine());
		setAnotacoes(ler.nextLine());
		System.out.println(" ");
		System.out.println("Evento criado com sucesso!");
		System.out.println("Data e horario marcado para: " + dia + "/" + mes + " as " + getHorarioInicio() + "h");
		System.out.println(" ");
		System.out.println("=====================================================================");
		System.out.println(" ");
	}

	//metodo para entrar na secao de Evento 
	public void selecaoInicial() {
		String selecaoInicial = ler.nextLine();
		if (selecaoInicial.equalsIgnoreCase("Evento")) {
			System.out.println(" ");
			System.out.println("Para adicionar um Evento, digite: add");
			selecaoInicial = ler.next();
			System.out.println(" ");
			if (selecaoInicial.equalsIgnoreCase("add")) {
				cadastrar(); //acessa o metodo que cadastra o evento
			} else
				System.out.println("Comando inválido!");
		} else
			System.out.println("Comando inválido!");
	}

	//metodo para um "menu" de selecao
	public void menu() {
		int selecione;
		System.out.println("                  Adicione CONVIDADOS ao Evento");
		convidados.cadastrar(); //instancia o metodo que cadastra os convidados
		System.out.println(" ");
		System.out.println("             Para adicionar GASTOS ao Evento, digite 1: ");
		System.out.println("             Para adicionar TAREFAS ao Evento,digite 2:");
		selecione = ler.nextInt();
		if (selecione == 1) {
			gastos.cadastrar(); //instancia o metodo que cadastra os gastos
			System.out.println("             Para adicionar TAREFAS ao Evento,digite 2:");
			selecione = ler.nextInt();
			if (selecione == 2) {
				tarefa.cadastrar(); //instancia o metodo que cadastra as tarefas
				visualizar(); //instancia o metodo visualizar
			}
		} else if (selecione == 2) {
			tarefa.cadastrar(); //instancia o metodo que cadastra as tarefas
			System.out.println("             Para adicionar GASTOS ao Evento, digite 1: ");
			selecione = ler.nextInt();
			if (selecione == 1) {
				gastos.cadastrar(); //instancia o metodo que cadastra os gastos
				visualizar(); //instancia submenu
			}
		}
	}

	//metodo que oferece ao usuario visualizar as listas
	public void visualizar() {
		do{
			System.out.println(" ");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("         Para visualizar a lista de CONVIDADOS, digite 1: ");
			System.out.println("         Para visualizar a lista de GASTOS,     digite 2: ");
			System.out.println("         Para visualizar a lista de TARERAS,    digite 3");
			System.out.println("                    Para ENCERRAR, digite 0");
			setParar(ler.nextInt());
			System.out.println("----------------------------------------------------------------------");
			if (getParar() == 1)
				convidados.consultarConvidadosCadastrados();
			else if (getParar() == 2)
				gastos.consultarGastosCadastrados();
			else if (getParar() == 3)
				tarefa.consultarGastosCadastrados();
		}while (getParar() != 0);
	}
}

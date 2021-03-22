package saida;

import java.util.Scanner;

public class Descricoes {

	public Descricoes() {}
	
	public void inicializacao() {
		System.out.println("          Olá, Seja Bem-vindo");
		System.out.println(" ");
		System.out.println("Para acessar o menu de Eventos, digite: E");
		System.out.println("Para acessar o menu de Tarefas, digite: T");
		System.out.println("Para acessar o menu de Gastos,  digite: G");
	}
	
	Scanner ler = new Scanner(System.in);
	
	public String sucesso(String sucesso) {
		System.out.println(sucesso + " criado com sucesso!");
		return sucesso;
	} 
	
	public String cadastro(String menu) {
		System.out.print("Nome do " + menu + " que deseja adicionar: ");		
		return menu;
	}
	
	public void entradaTipoEvento() {
		System.out.print("Tipo do Evento: ");		
	}
	public void horaEvento() {
		System.out.print("Digite, apenas a hora, que ocorrera o evento: ");
	}
	public void entradaAnotacao() {
		System.out.print("Caso deseja adicionar alguma anotacao, digite aqui: ");
	}
	
	public void data() {
		System.out.print("Digite, apenas com numeros, o mes do Evento: ");
		int mes = ler.nextInt();
		System.out.print("Digite o dia do Evento: ");
		int dia = ler.nextInt();
		System.out.println("Data escolhida: " + dia + "/" + mes);
	}
	
	
}

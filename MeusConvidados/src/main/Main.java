package main;

import modelo.*;


public class Main {

	public static void main(String[] args) {	
		
		
		Evento evento = new Evento();	//instancia de objeto 	
		
		evento.inicializacaoMenu(); 	//instancia metodo que mostra mensagem inicial ao usuario
		
		evento.selecaoInicial();		//instancia metodo para criar eventos

		evento.menu();					//instancia metodo que tras "menu" de selecao, criar e mostra listas

	}

}

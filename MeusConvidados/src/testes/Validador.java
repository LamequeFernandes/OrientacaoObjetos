package testes;
import java.time.LocalDate;

import modelo.*;

/**
 * 
 * Classe em que coloquei alguns metodos de classes distintas para melhor visualização dos testes.
 * 
 * @author Lameque Fernandes
 *
 */

public class Validador {
	private Evento e;
	private Convidados c;
	
	Evento evento = new Evento();
	Convidados convidados = new Convidados();
	
	public Validador() {}
	
	public boolean validaHorario(int horario) {
		boolean aux = true;
		evento.setHorarioInicio(horario);
		if(evento.getHorarioInicio() < 0) 
			aux = false;		
		
		if(evento.getHorarioInicio() > 24) 
			aux = false;
				
		return aux;
	}
	
	public boolean validaData(String data) {
		boolean aux = true;
		evento.setDataEvento(data);
		
		String[] dataSeparada = evento.getDataEvento().split("/");		
		
		if(Integer.parseInt(dataSeparada[2]) < 2020) 
			aux = false;		
		
		if(Integer.parseInt(dataSeparada[1]) < 1 || Integer.parseInt(dataSeparada[1]) > 12)
			aux = false;
				
		if(Integer.parseInt(dataSeparada[0]) < 1 || Integer.parseInt(dataSeparada[0]) > 31)
			aux = false;
				
		return aux;
	}
	
	public boolean validaNome(String nome) {
		boolean aux = true;
		convidados.setNome(nome);
		
		if(!convidados.getNome().substring(0, convidados.getNome().length()).matches("[a-zA-Z\\s]+"))
			aux = false;			
		
		return aux;		
		
	}
}

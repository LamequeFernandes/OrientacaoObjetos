package testes;
import java.time.LocalDate;

import modelo.*;


public class Validador {
	private Evento e;
	
	Evento evento = new Evento();

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
	//	data = evento.getDataEvento();
		
		String[] dataSeparada = evento.getDataEvento().split("/");		
		
		if(Integer.parseInt(dataSeparada[2]) < 2020) 
			aux = false;		
		
		if(Integer.parseInt(dataSeparada[1]) < 1 || Integer.parseInt(dataSeparada[1]) > 12)
			aux = false;
				
		if(Integer.parseInt(dataSeparada[0]) < 1 || Integer.parseInt(dataSeparada[0]) > 31)
			aux = false;
				
		return aux;
	}
}

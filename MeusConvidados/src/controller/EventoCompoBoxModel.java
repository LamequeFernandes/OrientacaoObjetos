package controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

import modelo.Evento;

//class para facilitar na manipulação de JComboBox.

public class EventoCompoBoxModel extends AbstractListModel implements ComboBoxModel{

	
	private List<Evento> listaEventos;
	private Evento eventoSelecionado;

	public EventoCompoBoxModel() {
		this.listaEventos = new ArrayList<>();
	}

	@Override
	public int getSize() {
		return listaEventos.size();
	}
	
	@Override
	public Object getElementAt(int arg0) {
		return this.listaEventos.get(arg0);
	}

	@Override
	public void setSelectedItem(Object arg0) {
		if(arg0 instanceof Evento) {
			this.eventoSelecionado = (Evento) arg0;
			fireContentsChanged(this.listaEventos, 0, this.listaEventos.size());
		}
	}
	
	@Override
	public Object getSelectedItem() {		
		return this.eventoSelecionado;
	}
	
	public void addEvento(Evento e) {
		this.listaEventos.add(e);
	}	

}

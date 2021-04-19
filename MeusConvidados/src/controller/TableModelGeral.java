package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Convidados;
import modelo.Evento;


public class TableModelGeral extends AbstractTableModel{
	
		private List<Evento> dados = new ArrayList<>();
		
		private String[] colunas = {"Evento"};
		
		@Override
		public String getColumnName(int column) {
			return colunas[column];
		}
		
		@Override
		public int getRowCount() {
			return dados.size();
		}

		@Override
		public int getColumnCount() {
			return colunas.length;
		}

		@Override
		public Object getValueAt(int linha, int coluna) {
			
			switch(coluna) {
				case 0:
					return dados.get(linha).getNomeEvento();
			}			
			return null;
		}
		
		@Override
		public void setValueAt(Object valor, int linha, int coluna) {
			switch(coluna) {
			case 0:
				dados.get(linha).setNomeEvento((String) valor);
				break;
			}		
			this.fireTableRowsUpdated(linha, linha);
		}
		
		public void addLinha(Evento e) {			
			this.dados.add(e);
			this.fireTableDataChanged();
		}		
				
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}

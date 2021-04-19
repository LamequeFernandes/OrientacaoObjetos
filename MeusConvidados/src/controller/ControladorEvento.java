package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Evento;

//organiza os dados obtidos da model Eventos na JTable

public class ControladorEvento extends AbstractTableModel{
	
		private List<Evento> dados = new ArrayList<>();
		private String[] colunas = {"Evento", "Tipo", "Data", "Horario"};
		
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
				case 1:
					return dados.get(linha).getTipoEvento();
				case 2:
					return dados.get(linha).getDataEvento();
				case 3:
					return dados.get(linha).getHorarioInicio();				
			}			
			return null;
		}
		
		@Override
		public void setValueAt(Object valor, int linha, int coluna) {
			switch(coluna) {
			case 0:
				dados.get(linha).setNomeEvento((String) valor);
				break;
			case 1:
				dados.get(linha).setTipoEvento((String) valor);
				break;
			case 2:
				dados.get(linha).setDataEvento((String) valor);
				break;
			case 3:
				dados.get(linha).setHorarioInicio((String) valor);		
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

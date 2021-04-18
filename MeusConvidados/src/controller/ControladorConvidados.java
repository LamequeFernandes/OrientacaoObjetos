package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Convidados;


public class ControladorConvidados extends AbstractTableModel{
	
		private List<Convidados> dados = new ArrayList<>();
		private String[] colunas = {"Nome", "Tipo", "Idade", "Telefone"};
		
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
					return dados.get(linha).getNome();
				case 1:
					return dados.get(linha).getTipoConvidado();
				case 2:
					return dados.get(linha).getIdade();
				case 3:
					return dados.get(linha).getNumTelefone();				
			}			
			return null;
		}
		
		public void addLinha(Convidados c) {			
			this.dados.add(c);
			this.fireTableDataChanged();
		}		
		
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}

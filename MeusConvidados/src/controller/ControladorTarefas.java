package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Tarefas;


public class ControladorTarefas extends AbstractTableModel{
	
		private List<Tarefas> dados = new ArrayList<>();
		private String[] colunas = {"Descrição", "Prioridade"};
		
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
					return dados.get(linha).getDescricaoTarefa();
				case 1:
					return dados.get(linha).getPrioridadeTarefa();			
			}			
			return null;
		}
		
		public void addLinha(Tarefas t) {			
			this.dados.add(t);
			this.fireTableDataChanged();
		}	
		
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}

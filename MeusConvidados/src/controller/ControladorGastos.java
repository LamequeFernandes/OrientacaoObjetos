package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Gastos;


public class ControladorGastos extends AbstractTableModel{
	
		private List<Gastos> dados = new ArrayList<>();
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
					return dados.get(linha).getDescricaoGasto();
				case 1:
					return dados.get(linha).getValorGasto();		
			}			
			return null;
		}
		
		public void addLinha(Gastos g) {			
			this.dados.add(g);
			this.fireTableDataChanged();
		}		
	}

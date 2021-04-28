package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Tarefas;

/**
 * Organiza e controla de modo eficiente os dados dos Gastos e guarda-os em modelo de tabela. <br>
 * Além de cadastrar, editar e remover Tarefas
 * 
 * @Versão 1.0 (Abril 2021)
 * @author Lameque Fernandes
 */
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

		/**
		 * Retorna o valor em determinada célula, dado os argumentos de posição de linha e coluna
		 */
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
		
		@Override
		public void setValueAt(Object valor, int linha, int coluna) {
			switch(coluna) {
			case 0:
				dados.get(linha).setDescricaoTarefa((String) valor);
				break;
			case 1:
				dados.get(linha).setPrioridadeTarefa((String) valor);
				break;
			}		
			this.fireTableRowsUpdated(linha, linha);
		}
		
		/**
		 * Adiciona ou "Cadastra" uma Tarefa a tabela e atualiza os dados da mesma
		 * @param t
		 */
		public void addLinha(Tarefas t) {			
			this.dados.add(t);
			this.fireTableDataChanged();
		}	
		
		/**
		 * Remove uma Tarefa da tabela e atualiza os dados da mesma
		 * @param linha
		 */
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}

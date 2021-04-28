package controller;

/**
 * Organiza e controla de modo eficiente os dados dos Gastos e guarda-os em modelo de tabela. <br>
 * Além de cadastrar, editar e remover Gastos
 * 
 * @Versão 1.0 (Abril 2021)
 * @author Lameque Fernandes
 */


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Evento;
import modelo.Gastos;

public class ControladorGastos extends AbstractTableModel{
	
		private List<Gastos> dados = new ArrayList<>();
		
		private String[] colunas = {"Descrição", "Valor R$", "Forma de Pagamento"};
		
		@Override
		public String getColumnName(int column) {
			return colunas[column];
		}
		
		/**
		 * Responsavel por definir a quantidade de linhas da "lista"
		 */
		@Override
		public int getRowCount() {
			return dados.size();
		}

		/**
		 * Responsavel por definir a quantidade de colunas da "lista"
		 */
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
					return dados.get(linha).getDescricaoGasto();
				case 1:
					return dados.get(linha).getValorGasto();	
				case 2:
					return dados.get(linha).getFormaPagamento();
			}			
			return null;
		}
		
		@Override
		public void setValueAt(Object valor, int linha, int coluna) {
			switch(coluna) {
			case 0:
				dados.get(linha).setDescricaoGasto((String) valor);
				break;
			case 1:
				dados.get(linha).setValorGasto(Double.parseDouble((String) valor));
				break;
			case 2:
				dados.get(linha).setFormaPagamento((String) valor);
				break;
			}		
			this.fireTableRowsUpdated(linha, linha);
		}
		
		/**
		 * Adiciona ou "Cadastra" um Gasto a tabela e atualiza os dados da mesma
		 * @param g
		 */
		public void addLinha(Gastos g) {			
			this.dados.add(g);
			this.fireTableDataChanged();
		}	
		
		/**
		 * Remove um Gasto da tabela e atualiza os dados da mesma
		 * @param linha
		 */
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}

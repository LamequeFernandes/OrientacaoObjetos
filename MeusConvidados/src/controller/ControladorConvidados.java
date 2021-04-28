package controller;

		
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Convidados;
import modelo.Evento;


/**
 * Organiza e controla de modo eficiente os dados dos convidados e guarda-os em modelo de tabela.,<br>
 * Além de cadastrar, editar e remover Convidados
 * 
 * @version 1.0 (Abril 2021)
 * @author Lameque Fernandes
 */
public class ControladorConvidados extends AbstractTableModel{
	
		private List<Convidados> dados = new ArrayList<>();
		
		private String[] colunas = {"Nome", "Tipo", "Idade", "Telefone"};
		
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
		
		@Override
		public void setValueAt(Object valor, int linha, int coluna) {
			switch(coluna) {
			case 0:
				dados.get(linha).setNome((String) valor);
				break;
			case 1:
				dados.get(linha).setTipoConvidado((String) valor);
				break;
			case 2:
				dados.get(linha).setIdade(Integer.parseInt((String) valor));
				break;
			case 3:
				dados.get(linha).setNumTelefone(Long.parseLong((String) valor));		
				break;	
			}		
			this.fireTableRowsUpdated(linha, linha);
		}
		
		/**
		 * Adiciona ou "Cadastra" convidado a tabela e atualiza os dados da mesma
		 * @param c
		 */
		public void addLinha(Convidados c) {			
			this.dados.add(c);
			this.fireTableDataChanged();
		}		
			
		/**
		 * Remove convidado da tabela e atualiza os dados da mesma
		 * @param linha
		 */
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
	}

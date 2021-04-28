package controller;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

import modelo.Evento;

/**
 * Organiza e controla de modo eficiente os dados dos Eventos e guarda-os em modelo de tabela.<br>
 * Além de cadastrar, editar e remover Eventos
 * 
 * @Versão 1.0 (Abril 2021)
 * @author Lameque Fernandes
 */
public class ControladorEvento extends AbstractTableModel{
	
		private List<Evento> dados = new ArrayList<>();
		private String[] colunas = {"Evento", "Tipo", "Data", "Horario"};
		Evento evento = new Evento();
		
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
				dados.get(linha).setHorarioInicio((int) valor);		
				break;
			}		
			this.fireTableRowsUpdated(linha, linha);
		}
		
		/**
		 * Adiciona ou "Cadastra" Evento a tabela e atualiza os dados da mesma
		 * @param e
		 */
		public void addLinha(Evento e) {			
			this.dados.add(e);
			this.fireTableDataChanged();
		}		
		
		/**
		 * Remove Evento da tabela e atualiza os dados da mesma
		 * @param linha
		 */
		public void removeLinha(int linha){
	        this.dados.remove(linha);
	        this.fireTableRowsDeleted(linha, linha);
	    }
		
		public boolean validaHorario(int horario) {
			boolean aux = true;
			evento.setHorarioInicio(horario);
			if(evento.getHorarioInicio() < 0) 
				aux = false;		
			
			if(evento.getHorarioInicio() > 24) 
				aux = false;					
			return aux;
		}
	}

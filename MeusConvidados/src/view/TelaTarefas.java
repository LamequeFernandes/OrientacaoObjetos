package view;

import controller.ControladorConvidados;
import controller.ControladorTarefas;
import modelo.Convidados;
import modelo.Tarefas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class TelaTarefas extends JPanel {
	private JTable jTTarefas;
	private JTable table;
//	private javax.swing.JScrollPane jScrollPane1;
	
	ControladorTarefas tableModel = new ControladorTarefas();
	private JTextField txtDescricao;
	
	public TelaTarefas() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 668, 454);
		setVisible(true);
		setLayout(null);
				
		JLabel lblTitulo = new JLabel("Lista de Tarefas\n");
		lblTitulo.setBounds(12, 12, 644, 35);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 28));
		add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(28, 211, 611, 225);
		add(scroll);
		
		jTTarefas = new JTable();
		jTTarefas.setModel(new javax.swing.table.DefaultTableModel(
	            new Object [][] {
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null},
	                {null, null, null, null}
	            },
	            new String [] {
	                "Title 1", "Title 2", "Title 3", "Title 4"
	            }
	        ));
		scroll.setViewportView(jTTarefas);
		jTTarefas.setModel(tableModel);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(28, 82, 309, 83);
		add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setBounds(28, 62, 222, 15);
		add(lblDescricao);
		
		JLabel lblPrioridade = new JLabel("Prioridade:");
		lblPrioridade.setFont(new Font("Dialog", Font.BOLD, 13));
		lblPrioridade.setBounds(28, 182, 91, 19);
		add(lblPrioridade);
		
		JComboBox boxPrioridade = new JComboBox();
		boxPrioridade.setModel(new DefaultComboBoxModel(new String[] {"Desejavel", "Necessario", "Essencial", "URGENTE"}));
		boxPrioridade.setBounds(115, 182, 222, 19);
		add(boxPrioridade);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(475, 79, 162, 25);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String prioridade = boxPrioridade.getSelectedItem().toString();
				Tarefas t = new Tarefas();
				t.setDescricaoTarefa(txtDescricao.getText());	
		        t.setPrioridadeTarefa(prioridade);
		        
		        tableModel.addLinha(t);
		        JOptionPane.showMessageDialog(null, "Tarefa cadastrada com sucesso!");			
			}
		});
		add(botaoAdicionar);		
		
		JButton botaoRemover = new JButton("Remover");
		botaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jTTarefas.getSelectedRow() != -1) {
					tableModel.removeLinha(jTTarefas.getSelectedRow());
				}
			}
		});
		botaoRemover.setBounds(475, 127, 162, 25);
		add(botaoRemover);
		
		JButton botaoEditar = new JButton("Editar");
		botaoEditar.setBounds(475, 174, 162, 25);
		add(botaoEditar);			
		
	}	  
	
}

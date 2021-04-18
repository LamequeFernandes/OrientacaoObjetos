package view;

import controller.ControladorGastos;
import modelo.Convidados;
import modelo.Gastos;
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

public class TelaGastos extends JPanel {
	private JTable jTGastos;
	private JTable table;
//	private javax.swing.JScrollPane jScrollPane1;
	
	ControladorGastos tableModel = new ControladorGastos();
	private JTextField txtDescricao;
	private JTextField txtValor;
	
	public TelaGastos() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 668, 454);
		setVisible(true);
		setLayout(null);
				
		JLabel lblTitulo = new JLabel("Lista de Gastos");
		lblTitulo.setBounds(12, 12, 644, 35);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 28));
		add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(28, 211, 611, 225);
		add(scroll);
		
		jTGastos = new JTable();
		jTGastos.setModel(new javax.swing.table.DefaultTableModel(
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
		scroll.setViewportView(jTGastos);
		jTGastos.setModel(tableModel);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(28, 87, 309, 35);
		add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição do gasto:");
		lblDescricao.setBounds(28, 68, 222, 15);
		add(lblDescricao);
		
		JLabel lblValor = new JLabel("Valor total:");
		lblValor.setFont(new Font("Dialog", Font.BOLD, 13));
		lblValor.setBounds(28, 140, 91, 19);
		add(lblValor);
		
		JComboBox boxFormaPagamento = new JComboBox();
		boxFormaPagamento.setModel(new DefaultComboBoxModel(new String[] {"Débito", "Crédito", "Dinheiro"}));
		boxFormaPagamento.setBounds(191, 176, 145, 19);
		add(boxFormaPagamento);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(475, 79, 162, 25);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pagamento = boxFormaPagamento.getSelectedItem().toString();
				Gastos g = new Gastos();
				
				g.setDescricaoGasto(txtDescricao.getText());
				g.setValorGasto(Double.parseDouble(txtValor.getText()));
		        g.setFormaPagamento(pagamento);
		        
		        tableModel.addLinha(g);
		        JOptionPane.showMessageDialog(null, "Gasto cadastrado com sucesso!");			
			}
		});
		add(botaoAdicionar);		
		
		JButton botaoRemover = new JButton("Remover");
		botaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jTGastos.getSelectedRow() != -1) {
					tableModel.removeLinha(jTGastos.getSelectedRow());
				}
			}
		});
		botaoRemover.setBounds(475, 127, 162, 25);
		add(botaoRemover);
		
		JButton botaoEditar = new JButton("Editar");
		botaoEditar.setBounds(475, 174, 162, 25);
		add(botaoEditar);			
		
		txtValor = new JTextField();
		txtValor.setBounds(117, 140, 220, 19);
		add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblFormaDoPagamento = new JLabel("Forma de Pagamento:");
		lblFormaDoPagamento.setBounds(28, 179, 167, 15);
		add(lblFormaDoPagamento);
		
		
	}	  
	
}

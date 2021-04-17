package view;

import controller.ControladorConvidados;
import controller.TableConvidados;

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class TelaConvidados extends JPanel {
	private JTable jTConvidados;
	private JTable table;
//	private javax.swing.JScrollPane jScrollPane1;
	
	TableConvidados tableModel = new TableConvidados();
	
	public TelaConvidados() {
		setBackground(new Color(204, 255, 255));
		setBounds(0, 0, 533, 379);
		setVisible(true);
		setLayout(null);
		
//		jTConvidados.setModel(tableModel);
			
		
		
		
		JLabel lblTitulo = new JLabel("Convidados\n");
		lblTitulo.setBounds(12, 12, 509, 46);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 34));
		add(lblTitulo);

		JButton botaoCriarConvidados = new JButton("Criar novo(s) convidado(s)");
		botaoCriarConvidados.setBounds(143, 342, 245, 25);
		add(botaoCriarConvidados);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 124, 509, 206);
		add(scrollPane);
		
		jTConvidados = new JTable();
		jTConvidados.setModel(new javax.swing.table.DefaultTableModel(
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
		scrollPane.setViewportView(jTConvidados);
		
		jTConvidados.setModel(tableModel);
		
		
		
			
		botaoCriarConvidados.addActionListener(new Botao() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCadastroConvidados frame = new TelaCadastroConvidados();
				frame.setVisible(true);
			}
		});
	}
		
/*	public void initComponents() {
		
		JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
		jTConvidados = new javax.swing.JTable();
				
		jTConvidados.setBounds(42, 98, 446, 174);
		
		jTConvidados.setModel(new javax.swing.table.DefaultTableModel(
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
	        jScrollPane1.setViewportView(jTConvidados);
		
	}
*/	
	
	
	
	public class Botao extends JFrame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			TelaCadastroConvidados frame = new TelaCadastroConvidados();
			frame.setVisible(true);
		}
	}
}

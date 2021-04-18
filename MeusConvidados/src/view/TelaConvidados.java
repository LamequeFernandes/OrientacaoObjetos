package view;

import controller.ControladorConvidados;
import controller.ControladorConvidados;
import modelo.Convidados;

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

public class TelaConvidados extends JPanel {
	private JTable jTConvidados;
	private JTable table;
//	private javax.swing.JScrollPane jScrollPane1;
	
	ControladorConvidados tableModel = new ControladorConvidados();
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	
	public TelaConvidados() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 668, 454);
		setVisible(true);
		setLayout(null);
				
		JLabel lblTitulo = new JLabel("Lista de convidados\n");
		lblTitulo.setBounds(12, 12, 644, 35);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 28));
		add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(28, 211, 611, 225);
		add(scroll);
		
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
		scroll.setViewportView(jTConvidados);
		jTConvidados.setModel(tableModel);
		
		txtNome = new JTextField();
		txtNome.setBounds(28, 82, 309, 19);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(28, 62, 132, 15);
		add(lblNome);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(28, 131, 148, 19);
		add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(28, 113, 132, 15);
		add(lblTelefone);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(188, 113, 70, 15);
		add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(188, 131, 149, 19);
		add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(188, 160, 115, 19);
		add(lblSexo);
		
		JComboBox boxSexo = new JComboBox();
		boxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Indefinido" }));
		boxSexo.setBounds(188, 180, 148, 19);
		add(boxSexo);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(28, 160, 132, 17);
		add(lblTipo);
		
		JComboBox boxTipoConvidado = new JComboBox();
		boxTipoConvidado.setModel(new DefaultComboBoxModel(new String[] { "Amigo", "Parente", "VIP" }));
		boxTipoConvidado.setBounds(28, 180, 148, 19);
		add(boxTipoConvidado);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(475, 79, 162, 25);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tipoConvidado = boxTipoConvidado.getSelectedItem().toString();
				Convidados c = new Convidados();
				c.setNome(txtNome.getText());				
				c.setNumTelefone(Long.parseLong(txtTelefone.getText()));
		        c.setIdade(Integer.parseInt(txtIdade.getText()));
		        c.setTipoConvidado(tipoConvidado);
		        
		        tableModel.addLinha(c);
		        JOptionPane.showMessageDialog(null, "Convidado cadastrado com sucesso!");			
			}
		});
		add(botaoAdicionar);		
		
		JButton botaoRemover = new JButton("Remover");
		botaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jTConvidados.getSelectedRow() != -1) {
					tableModel.removeLinha(jTConvidados.getSelectedRow());
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

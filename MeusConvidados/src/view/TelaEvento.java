package view;

import controller.ControladorEvento;
import modelo.Evento;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaEvento extends JPanel {
	private JTable jTEvento;
	private JTable table;
//	private javax.swing.JScrollPane jScrollPane1;
	
	ControladorEvento tableModel = new ControladorEvento();
	private JTextField txtTitulo;
	private JTextField txtData;
	private JTextField txtHorario;
	private JTextField txtAnotacoes;
	
	public TelaEvento() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 668, 454);
		setVisible(true);
		setLayout(null);
				
		JLabel lblTitulo = new JLabel("Lista de Eventos\n");
		lblTitulo.setBounds(12, 12, 644, 35);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 28));
		add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
				
		scroll.setBounds(28, 277, 611, 159);
		add(scroll);
		
		jTEvento = new JTable();
		jTEvento.setModel(new javax.swing.table.DefaultTableModel(
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
		scroll.setViewportView(jTEvento);
		jTEvento.setModel(tableModel);
		jTEvento.getColumnModel().getColumn(0).setPreferredWidth(280);
		jTEvento.getColumnModel().getColumn(1).setPreferredWidth(125);
		jTEvento.getColumnModel().getColumn(2).setPreferredWidth(125);
		jTEvento.getColumnModel().getColumn(3).setPreferredWidth(80);		
		
		jTEvento.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int linha = jTEvento.getSelectedRow();
				
			}
		});
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(28, 82, 309, 19);
		add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblNome = new JLabel("Titulo:");
		lblNome.setBounds(28, 62, 132, 15);
		add(lblNome);
		
		txtData = new JTextField();
		txtData.setBounds(28, 182, 148, 19);
		add(txtData);
		txtData.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(28, 164, 132, 15);
		add(lblData);
		
		JLabel lblHorario = new JLabel("Horario de Inicio:");
		lblHorario.setBounds(188, 164, 149, 15);
		add(lblHorario);
		
		txtHorario = new JTextField();
		txtHorario.setBounds(188, 182, 149, 19);
		add(txtHorario);
		txtHorario.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo do Evento:");
		lblTipo.setBounds(28, 113, 132, 17);
		add(lblTipo);
		
		JComboBox boxTipoEvento = new JComboBox();
		boxTipoEvento.setModel(new DefaultComboBoxModel(new String[] {"Aniversario", "Casamento", "Formatura", 
				"Religioso", "Esportivo", "Academico", "Corpotativo", "Outro..."}));
		boxTipoEvento.setBounds(28, 133, 309, 19);
		add(boxTipoEvento);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(477, 133, 162, 25);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tipoEvento = boxTipoEvento.getSelectedItem().toString();
				Evento e = new Evento();
				e.setNomeEvento(txtTitulo.getText());				
				e.setTipoEvento(tipoEvento);
		        e.setDataEvento((txtData.getText()));
		        e.setHorarioInicio(txtHorario.getText());
		        
		        tableModel.addLinha(e);
		        JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso!");			
			}
		});
		add(botaoAdicionar);		
		
		JButton botaoRemover = new JButton("Remover");
		botaoRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(jTEvento.getSelectedRow() != -1) {
					tableModel.removeLinha(jTEvento.getSelectedRow());
				}
			}
		});
		botaoRemover.setBounds(477, 181, 162, 25);
		add(botaoRemover);
		
		JButton botaoEditar = new JButton("Editar");
		botaoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tipoEvento = boxTipoEvento.getSelectedItem().toString();
				if(jTEvento.getSelectedRow() != -1) {
					tableModel.setValueAt(txtTitulo.getText(), jTEvento.getSelectedRow(), 0);
					tableModel.setValueAt(tipoEvento, jTEvento.getSelectedRow(), 1);
					tableModel.setValueAt(txtHorario.getText(), jTEvento.getSelectedRow(), 2);
					tableModel.setValueAt(txtData.getText(), jTEvento.getSelectedRow(), 3);
				}
			}
		});		
		botaoEditar.setBounds(477, 228, 162, 25);
		add(botaoEditar);			
		
		JLabel lblAnotaes = new JLabel("Anotações:");
		lblAnotaes.setBounds(28, 213, 148, 15);
		add(lblAnotaes);
		
		txtAnotacoes = new JTextField();
		txtAnotacoes.setBounds(28, 232, 309, 33);
		add(txtAnotacoes);
		txtAnotacoes.setColumns(10);
		
	}	  
}

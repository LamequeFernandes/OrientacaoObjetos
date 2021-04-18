package view;

import controller.ControladorConvidados;
import controller.ControladorGastos;
import controller.ControladorTarefas;
import modelo.Convidados;
import modelo.Evento;
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
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;

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
	private JComboBox comboBoxSelecionarEvento;
	ControladorTarefas tableModel = new ControladorTarefas();
	ArrayList<Evento> eventoArray;
	

	private JTextField txtDescricao;
	
	public TelaTarefas(ArrayList listaEvento) {
		this.eventoArray = listaEvento;
        initComponents();
       
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                super.componentShown(e);               
                comboBoxSelecionarEvento.setModel(new DefaultComboBoxModel(getListModel()));
            }

        });
	}
	
	private void initComponents() {

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
		scroll.setBounds(28, 224, 611, 212);
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
		jTTarefas.getColumnModel().getColumn(0).setPreferredWidth(450);
		jTTarefas.getColumnModel().getColumn(1).setPreferredWidth(161);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(28, 75, 309, 83);
		add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setBounds(28, 55, 222, 15);
		add(lblDescricao);
		
		JLabel lblPrioridade = new JLabel("Prioridade:");
		lblPrioridade.setFont(new Font("Dialog", Font.BOLD, 13));
		lblPrioridade.setBounds(28, 165, 91, 19);
		add(lblPrioridade);
		
		JComboBox boxPrioridade = new JComboBox();
		boxPrioridade.setModel(new DefaultComboBoxModel(new String[] {"Desejavel", "Necessario", "Essencial", "URGENTE"}));
		boxPrioridade.setBounds(115, 165, 222, 19);
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
		botaoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String prioridade = boxPrioridade.getSelectedItem().toString();
				if(jTTarefas.getSelectedRow() != -1) {
					tableModel.setValueAt(txtDescricao.getText(), jTTarefas.getSelectedRow(), 0);
					tableModel.setValueAt(prioridade, jTTarefas.getSelectedRow(), 1);
				}
			}
		});
		botaoEditar.setBounds(475, 174, 162, 25);
		add(botaoEditar);			
		
		JLabel lblEvento = new JLabel("Evento:");
		lblEvento.setBounds(28, 196, 70, 15);
		add(lblEvento);
		
		comboBoxSelecionarEvento = new JComboBox();
		comboBoxSelecionarEvento.setModel(new DefaultComboBoxModel(getListModel()));
		comboBoxSelecionarEvento.setBounds(94, 193, 247, 19);
		add(comboBoxSelecionarEvento);
	}
	
	
	private String[] getListModel() {
        String[] stringEvento = new String[eventoArray.size()];

        for (int i = 0; i < eventoArray.size(); i++) {
            stringEvento[i] = eventoArray.get(i).getNomeEvento();
            System.out.println(eventoArray.get(i).getNomeEvento());
        }
        return stringEvento;
    }
	
}

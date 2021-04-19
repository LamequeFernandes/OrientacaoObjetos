package view;

import controller.ControladorGastos;
import controller.TableModelGeral;
import controller.ControladorConvidados;
import modelo.Convidados;
import modelo.Evento;
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

public class TelaGastos extends JPanel {
	private JTable jTGastos;
	private JTextField txtDescricao;
	private JTextField txtValor;
	private JComboBox comboBoxSelecionarEvento;
	ControladorGastos tableModel = new ControladorGastos();
	TableModelGeral tableGeral = new TableModelGeral();
	ArrayList<Evento> eventoArray;	
	private JTable table_1;
	
	public TelaGastos(ArrayList listaEvento) {
    
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
				
		JLabel lblTitulo = new JLabel("Lista de Gastos");
		lblTitulo.setBounds(12, 12, 644, 35);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 28));
		add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(28, 220, 407, 216);
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
//		jTGastos.getColumnModel().getColumn(0).setPreferredWidth(320);
//		jTGastos.getColumnModel().getColumn(1).setPreferredWidth(100);
//		jTGastos.getColumnModel().getColumn(2).setPreferredWidth(191);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(28, 87, 309, 35);
		add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descrição do gasto:");
		lblDescricao.setBounds(28, 68, 222, 15);
		add(lblDescricao);
		
		JLabel lblValor = new JLabel("Valor total:");
		lblValor.setFont(new Font("Dialog", Font.BOLD, 13));
		lblValor.setBounds(28, 130, 91, 19);
		add(lblValor);
		
		JComboBox boxFormaPagamento = new JComboBox();
		boxFormaPagamento.setModel(new DefaultComboBoxModel(new String[] {"Débito", "Crédito", "Dinheiro"}));
		boxFormaPagamento.setBounds(191, 160, 145, 19);
		add(boxFormaPagamento);
		
		comboBoxSelecionarEvento = new JComboBox();
		comboBoxSelecionarEvento.setModel(new DefaultComboBoxModel(getListModel()));
		comboBoxSelecionarEvento.setBounds(88, 190, 249, 19);
		add(comboBoxSelecionarEvento);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(434, 220, 199, 216);
		add(scrollPane);	
		table_1 = new JTable();		
		table_1.setModel(new javax.swing.table.DefaultTableModel(
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
		scrollPane.setViewportView(table_1);
		table_1.setModel(tableGeral);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(475, 79, 162, 25);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pagamento = boxFormaPagamento.getSelectedItem().toString();
				String selecaoEvento = comboBoxSelecionarEvento.getSelectedItem().toString();
				Gastos g = new Gastos();
				Evento e = new Evento();
				
				g.setDescricaoGasto(txtDescricao.getText());
				g.setValorGasto(Double.parseDouble(txtValor.getText()));
		        g.setFormaPagamento(pagamento);
		        e.setNomeEvento(selecaoEvento);
		        
		        tableModel.addLinha(g);
		        tableGeral.addLinha(e);
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
		botaoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String formaPagamento = boxFormaPagamento.getSelectedItem().toString();
				if(jTGastos.getSelectedRow() != -1) {
					tableModel.setValueAt(txtDescricao.getText(), jTGastos.getSelectedRow(), 0);
					tableModel.setValueAt(txtValor.getText(), jTGastos.getSelectedRow(), 1);
					tableModel.setValueAt(formaPagamento, jTGastos.getSelectedRow(), 2);
				}
			}
		});
		botaoEditar.setBounds(475, 174, 162, 25);
		add(botaoEditar);			
		
		txtValor = new JTextField();
		txtValor.setBounds(117, 130, 220, 19);
		add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblFormaDoPagamento = new JLabel("Forma de Pagamento:");
		lblFormaDoPagamento.setBounds(28, 160, 167, 15);
		add(lblFormaDoPagamento);
		
		JLabel lblEvento = new JLabel("Evento:");
		lblEvento.setBounds(28, 193, 70, 15);
		add(lblEvento);		
			
		
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

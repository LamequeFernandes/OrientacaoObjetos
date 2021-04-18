package view;

import controller.ControladorConvidados;
import controller.EventoCompoBoxModel;
import modelo.Convidados;
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
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
import java.util.ArrayList;

public class TelaConvidados extends JPanel {
	private JTable jTConvidados;
	private JTable table;
	private Evento e;
	private EventoCompoBoxModel eventoCompoBoxModel;
	private JTextField txtNome;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JComboBox comboBoxSelecionarEvento;
	ArrayList<Evento> eventoArray;	
	ControladorConvidados tableModel = new ControladorConvidados();
	
	public TelaConvidados(ArrayList listaEvento) {       
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
		
	//	e = new Evento();
		eventoCompoBoxModel = new EventoCompoBoxModel();
		
		JLabel lblTitulo = new JLabel("Lista de convidados\n");
		lblTitulo.setBounds(12, 12, 644, 35);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 28));
		add(lblTitulo);
		
		JScrollPane scroll = new JScrollPane();
				
		scroll.setBounds(28, 221, 611, 215);
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
		jTConvidados.getColumnModel().getColumn(0).setPreferredWidth(200);
		jTConvidados.getColumnModel().getColumn(1).setPreferredWidth(90);
		jTConvidados.getColumnModel().getColumn(2).setPreferredWidth(70);
		jTConvidados.getColumnModel().getColumn(3).setPreferredWidth(110);
	//	jTConvidados.getColumnModel().getColumn(4).setPreferredWidth(140);	
		
		txtNome = new JTextField();
		txtNome.setBounds(28, 70, 309, 19);
		add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(28, 54, 132, 15);
		add(lblNome);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(28, 105, 148, 19);
		add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(28, 90, 132, 15);
		add(lblTelefone);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(188, 90, 70, 15);
		add(lblIdade);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(188, 105, 149, 19);
		add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(189, 125, 115, 19);
		add(lblSexo);
		
		JComboBox boxSexo = new JComboBox();
		boxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Indefinido" }));
		boxSexo.setBounds(189, 145, 148, 19);
		add(boxSexo);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(29, 125, 132, 17);
		add(lblTipo);
		
		JComboBox boxTipoConvidado = new JComboBox();
		boxTipoConvidado.setModel(new DefaultComboBoxModel(new String[] { "Amigo", "Parente", "VIP" }));
		boxTipoConvidado.setBounds(29, 145, 148, 19);
		add(boxTipoConvidado);
		
		comboBoxSelecionarEvento = new JComboBox();		
		comboBoxSelecionarEvento.setBounds(28, 190, 309, 19);
		comboBoxSelecionarEvento.setModel(new DefaultComboBoxModel(getListModel()));
		add(comboBoxSelecionarEvento);
		
		JButton botaoAdicionar = new JButton("Adicionar");
		botaoAdicionar.setBounds(475, 79, 162, 25);
		botaoAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				String tipoConvidado = boxTipoConvidado.getSelectedItem().toString();
				String selecaoEvento = comboBoxSelecionarEvento.getSelectedItem().toString();
				Convidados c = new Convidados();				
				Evento e = new Evento();
				
				c.setNome(txtNome.getText());
				c.setNumTelefone(Long.parseLong(txtTelefone.getText()));
		        c.setIdade(Integer.parseInt(txtIdade.getText()));
		        c.setTipoConvidado(tipoConvidado);
		        e.setNomeEvento(selecaoEvento);
		        
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
		botaoEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tipoConvidado = boxTipoConvidado.getSelectedItem().toString();
				if(jTConvidados.getSelectedRow() != -1) {
					tableModel.setValueAt(txtNome.getText(), jTConvidados.getSelectedRow(), 0);
					tableModel.setValueAt(tipoConvidado, jTConvidados.getSelectedRow(), 1);
					tableModel.setValueAt(txtIdade.getText(), jTConvidados.getSelectedRow(), 2);
					tableModel.setValueAt(txtTelefone.getText(), jTConvidados.getSelectedRow(), 3);
				}
			}
		});
		botaoEditar.setBounds(475, 174, 162, 25);
		add(botaoEditar);			
		
		JLabel lblEvento = new JLabel("Evento:");
		lblEvento.setBounds(29, 172, 70, 15);
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

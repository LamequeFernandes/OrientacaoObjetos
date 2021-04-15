package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class TelaCadastroTarefas extends JFrame {

	private JPanel cadastroEvento;
	private final JLabel lblCadastroDeEvento = new JLabel("Criação de Tarefa");
	private JTextField textFieldNomeEvento;
	
	public TelaCadastroTarefas() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 347, 313);
		cadastroEvento = new JPanel();
		cadastroEvento.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cadastroEvento);
		cadastroEvento.setLayout(null);
		lblCadastroDeEvento.setForeground(Color.BLACK);
		lblCadastroDeEvento.setBounds(5, 5, 330, 22);
		lblCadastroDeEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeEvento.setFont(new Font("Dialog", Font.BOLD, 20));
		cadastroEvento.add(lblCadastroDeEvento);
		this.setLocationRelativeTo(null);	
		
		JLabel lblNomeDoEvento = new JLabel("Descrição da Tarefa:");
		lblNomeDoEvento.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDoEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNomeDoEvento.setForeground(Color.BLACK);
		lblNomeDoEvento.setBounds(15, 50, 208, 15);
		cadastroEvento.add(lblNomeDoEvento);
		
		textFieldNomeEvento = new JTextField();
		textFieldNomeEvento.setBounds(12, 72, 307, 66);
		cadastroEvento.add(textFieldNomeEvento);
		textFieldNomeEvento.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(15, 228, 135, 25);
		cadastroEvento.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(184, 228, 135, 25);
		cadastroEvento.add(botaoCancelar);
		
		JLabel lblNewLabel = new JLabel("Prioridade:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setBounds(15, 150, 110, 15);
		cadastroEvento.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Baixa ", "Normal", "Alta", "URGENTE"}));
		comboBox.setBounds(15, 170, 135, 22);
		cadastroEvento.add(comboBox);
	}
}

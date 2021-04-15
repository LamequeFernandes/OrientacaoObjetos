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

public class TelaCadastroGastos extends JFrame {

	private JPanel cadastroEvento;
	private final JLabel lblCadastroDeEvento = new JLabel("Novo Gasto");
	private JTextField textFieldNomeEvento;
	private JTextField textField;
	
	public TelaCadastroGastos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 351, 286);
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
		
		JLabel lblNomeDoEvento = new JLabel("Descrição do Gasto:");
		lblNomeDoEvento.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDoEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNomeDoEvento.setForeground(Color.BLACK);
		lblNomeDoEvento.setBounds(15, 50, 208, 15);
		cadastroEvento.add(lblNomeDoEvento);
		
		textFieldNomeEvento = new JTextField();
		textFieldNomeEvento.setBounds(12, 72, 307, 46);
		cadastroEvento.add(textFieldNomeEvento);
		textFieldNomeEvento.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(12, 210, 135, 25);
		cadastroEvento.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(184, 210, 135, 25);
		cadastroEvento.add(botaoCancelar);
		
		JLabel lblNewLabel = new JLabel("Valor Total:");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setBounds(15, 135, 110, 15);
		cadastroEvento.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 155, 114, 25);
		cadastroEvento.add(textField);
		textField.setColumns(10);
	}
}

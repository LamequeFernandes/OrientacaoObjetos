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

public class TelaCadastroConvidados extends JFrame {

	private JPanel cadastroEvento;
	private final JLabel lblCadastroDeEvento = new JLabel("Cadastro de Convidados");
	private JTextField textFieldNomeEvento;
	private JTextField textField;
	private JTextField textField_1;
	
	public TelaCadastroConvidados() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 557, 270);
		cadastroEvento = new JPanel();
		cadastroEvento.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cadastroEvento);
		cadastroEvento.setLayout(null);
		lblCadastroDeEvento.setForeground(Color.BLACK);
		lblCadastroDeEvento.setBounds(5, 5, 540, 22);
		lblCadastroDeEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeEvento.setFont(new Font("Dialog", Font.BOLD, 20));
		cadastroEvento.add(lblCadastroDeEvento);
		this.setLocationRelativeTo(null);	
		
		JLabel lblNomeDoEvento = new JLabel("Nome:");
		lblNomeDoEvento.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDoEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNomeDoEvento.setForeground(Color.BLACK);
		lblNomeDoEvento.setBounds(15, 50, 58, 15);
		cadastroEvento.add(lblNomeDoEvento);
		
		JLabel lblTipoDeEvento = new JLabel("Idade:");
		lblTipoDeEvento.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipoDeEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipoDeEvento.setForeground(Color.BLACK);
		lblTipoDeEvento.setBounds(15, 80, 58, 15);
		cadastroEvento.add(lblTipoDeEvento);
		
		textFieldNomeEvento = new JTextField();
		textFieldNomeEvento.setBounds(70, 48, 241, 19);
		cadastroEvento.add(textFieldNomeEvento);
		textFieldNomeEvento.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(375, 125, 149, 25);
		cadastroEvento.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(375, 93, 149, 25);
		cadastroEvento.add(botaoCancelar);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSexo.setBounds(15, 140, 58, 15);
		cadastroEvento.add(lblSexo);
		
		JLabel lblCelular = new JLabel("Tel::");
		lblCelular.setHorizontalAlignment(SwingConstants.LEFT);
		lblCelular.setForeground(Color.BLACK);
		lblCelular.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblCelular.setBounds(15, 110, 58, 15);
		cadastroEvento.add(lblCelular);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipo.setBounds(15, 170, 58, 15);
		cadastroEvento.add(lblTipo);
		
		textField = new JTextField();
		textField.setBounds(70, 77, 124, 19);
		cadastroEvento.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 107, 124, 19);
		cadastroEvento.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Indefinido"}));
		comboBox.setBounds(70, 135, 124, 19);
		cadastroEvento.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Amigo", "Parente", "VIP"}));
		comboBox_1.setBounds(70, 165, 124, 20);
		cadastroEvento.add(comboBox_1);
		
		JButton btnSalvarENovo = new JButton("Continuar adicionando");
		btnSalvarENovo.setBounds(309, 157, 215, 25);
		cadastroEvento.add(btnSalvarENovo);
	}
}

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

public class TelaCadastroEvento extends JFrame {

	private JPanel cadastroEvento;
	private final JLabel lblCadastroDeEvento = new JLabel("Cadastro de Evento");
	private JTextField textFieldNomeEvento;
	private JTextField textFieldData;
	private JTextField textFieldHorario;
	private JTextField textFieldAnotaçoes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEvento frame = new TelaCadastroEvento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public TelaCadastroEvento() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 551, 273);
		cadastroEvento = new JPanel();
		cadastroEvento.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cadastroEvento);
		cadastroEvento.setLayout(null);
		lblCadastroDeEvento.setForeground(Color.BLACK);
		lblCadastroDeEvento.setBounds(5, 5, 534, 22);
		lblCadastroDeEvento.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeEvento.setFont(new Font("Dialog", Font.BOLD, 20));
		cadastroEvento.add(lblCadastroDeEvento);
		
		JLabel lblNomeDoEvento = new JLabel("Nome do Evento: ");
		lblNomeDoEvento.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeDoEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNomeDoEvento.setForeground(Color.BLACK);
		lblNomeDoEvento.setBounds(15, 50, 141, 15);
		cadastroEvento.add(lblNomeDoEvento);
		
		JLabel lblTipoDeEvento = new JLabel("Tipo de Evento:");
		lblTipoDeEvento.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipoDeEvento.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipoDeEvento.setForeground(Color.BLACK);
		lblTipoDeEvento.setBounds(15, 80, 129, 15);
		cadastroEvento.add(lblTipoDeEvento);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setHorizontalAlignment(SwingConstants.LEFT);
		lblData.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblData.setForeground(Color.BLACK);
		lblData.setBounds(15, 110, 44, 15);
		cadastroEvento.add(lblData);
		
		JLabel lblHorarioDeInicio = new JLabel("Horario:");
		lblHorarioDeInicio.setHorizontalAlignment(SwingConstants.LEFT);
		lblHorarioDeInicio.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblHorarioDeInicio.setForeground(Color.BLACK);
		lblHorarioDeInicio.setBounds(192, 110, 70, 15);
		cadastroEvento.add(lblHorarioDeInicio);
		
		JLabel lblAnotacoes = new JLabel("Anotações:");
		lblAnotacoes.setHorizontalAlignment(SwingConstants.LEFT);
		lblAnotacoes.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblAnotacoes.setForeground(Color.BLACK);
		lblAnotacoes.setBounds(15, 140, 87, 15);
		cadastroEvento.add(lblAnotacoes);
		
		textFieldNomeEvento = new JTextField();
		textFieldNomeEvento.setBounds(138, 48, 220, 19);
		cadastroEvento.add(textFieldNomeEvento);
		textFieldNomeEvento.setColumns(10);
		
		JComboBox boxTipoEvento = new JComboBox();
		boxTipoEvento.setModel(new DefaultComboBoxModel(new String[] {"Aniversario", "Casamento", "Formatura", "Religioso", "Esportivo", "Academico", "Corpotativo", "Outro..."}));
		boxTipoEvento.setBounds(138, 78, 220, 20);
		cadastroEvento.add(boxTipoEvento);
		
		textFieldData = new JTextField();
		textFieldData.setBounds(60, 108, 114, 19);
		cadastroEvento.add(textFieldData);
		textFieldData.setColumns(10);
		
		textFieldHorario = new JTextField();
		textFieldHorario.setBounds(255, 108, 103, 19);
		cadastroEvento.add(textFieldHorario);
		textFieldHorario.setColumns(10);
		
		textFieldAnotaçoes = new JTextField();
		textFieldAnotaçoes.setBounds(97, 140, 261, 62);
		cadastroEvento.add(textFieldAnotaçoes);
		textFieldAnotaçoes.setColumns(10);
		
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(412, 177, 117, 25);
		cadastroEvento.add(botaoSalvar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(412, 140, 117, 25);
		cadastroEvento.add(botaoCancelar);
	}
}

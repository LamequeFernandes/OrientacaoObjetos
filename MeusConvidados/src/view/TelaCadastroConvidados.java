package view;

import controller.ControladorConvidados;
import controller.TableConvidados;
import modelo.Convidados;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class TelaCadastroConvidados extends JFrame {
	
	TableConvidados tableModel = new TableConvidados();

	private JPanel cadastroConvidados;
	private final JLabel lblCadastroDeConvidados = new JLabel("Cadastro de Convidados");
	private JTextField textFieldNomeConvidado;
	private JTextField textFieldIdade;
	private JTextField textFieldTelefone;
		
	public TelaCadastroConvidados() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 557, 270);
		cadastroConvidados = new JPanel();
		cadastroConvidados.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cadastroConvidados);
		cadastroConvidados.setLayout(null);
		lblCadastroDeConvidados.setForeground(Color.BLACK);
		lblCadastroDeConvidados.setBounds(5, 5, 540, 22);
		lblCadastroDeConvidados.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroDeConvidados.setFont(new Font("Dialog", Font.BOLD, 20));
		cadastroConvidados.add(lblCadastroDeConvidados);
		this.setLocationRelativeTo(null);

		JLabel lblNomeConvidado = new JLabel("Nome:");
		lblNomeConvidado.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeConvidado.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNomeConvidado.setForeground(Color.BLACK);
		lblNomeConvidado.setBounds(15, 50, 58, 15);
		cadastroConvidados.add(lblNomeConvidado);

		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdade.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblIdade.setForeground(Color.BLACK);
		lblIdade.setBounds(15, 80, 58, 15);
		cadastroConvidados.add(lblIdade);

		textFieldNomeConvidado = new JTextField();
		textFieldNomeConvidado.setBounds(70, 48, 241, 19);
		cadastroConvidados.add(textFieldNomeConvidado);
		textFieldNomeConvidado.setColumns(10);

		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setForeground(Color.BLACK);
		lblSexo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblSexo.setBounds(15, 140, 58, 15);
		cadastroConvidados.add(lblSexo);

		JLabel lblTelefone = new JLabel("Tel::");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setForeground(Color.BLACK);
		lblTelefone.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTelefone.setBounds(15, 110, 58, 15);
		cadastroConvidados.add(lblTelefone);

		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTipo.setForeground(Color.BLACK);
		lblTipo.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblTipo.setBounds(15, 170, 58, 15);
		cadastroConvidados.add(lblTipo);

		textFieldIdade = new JTextField();
		textFieldIdade.setBounds(70, 77, 124, 19);
		cadastroConvidados.add(textFieldIdade);
		textFieldIdade.setColumns(10);

		textFieldTelefone = new JTextField();
		textFieldTelefone.setBounds(70, 107, 124, 19);
		cadastroConvidados.add(textFieldTelefone);
		textFieldTelefone.setColumns(10);

		JComboBox boxSexo = new JComboBox();
		boxSexo.setModel(new DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Indefinido" }));
		boxSexo.setBounds(70, 135, 124, 19);
		cadastroConvidados.add(boxSexo);

		JComboBox boxTipoConvidado = new JComboBox();
		boxTipoConvidado.setModel(new DefaultComboBoxModel(new String[] { "Amigo", "Parente", "VIP" }));
		boxTipoConvidado.setBounds(70, 165, 124, 20);
		cadastroConvidados.add(boxTipoConvidado);

		JButton botaoContinuarAdicionando = new JButton("Continuar adicionando");
		botaoContinuarAdicionando.setBounds(309, 157, 215, 25);
		cadastroConvidados.add(botaoContinuarAdicionando);

		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.setBounds(375, 125, 149, 25);
		cadastroConvidados.add(botaoSalvar);
		botaoSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				ControladorConvidados c = new ControladorConvidados();
				
				Convidados c = new Convidados();
				String tipoConvidado = boxTipoConvidado.getSelectedItem().toString();
				
				
				c.setNome(textFieldNomeConvidado.getText());
				c.setTipoConvidado(tipoConvidado);
				c.setIdadee(textFieldIdade.getText());
				c.setTelefone(textFieldTelefone.getText());
				
				tableModel.addLinha(c);	
				
				
				JOptionPane.showMessageDialog(null, "Convidado cadastrado com sucesso!");						
				TelaCadastroConvidados.this.dispose();
				
				
/*
				String sexo = boxSexo.getSelectedItem().toString();
				String tipoConvidado = boxTipoConvidado.getSelectedItem().toString();
				boolean sucesso;
				try {
					ControladorConvidados controladorConvidados = new ControladorConvidados();
					sucesso = controladorConvidados.cadastrarConvidado(textFieldNomeConvidado.getText(),
							textFieldIdade.getText(), textFieldTelefone.getText(), sexo, tipoConvidado);
					if (sucesso == true) {
						JOptionPane.showMessageDialog(null, "Convidado cadastrado com sucesso!");						
						TelaCadastroConvidados.this.dispose();
						
					} else
						JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro:" + ex);
				}
*/				
			}
		}); 

		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.setBounds(375, 93, 149, 25);
		cadastroConvidados.add(botaoCancelar);
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroConvidados.this.dispose();

			}
		});
	}

	public class Botao extends JFrame implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
	//		TelaCadastroConvidados.this.dispose();
			Convidados c = new Convidados();
			tableModel.addLinha(c);	
		}
	}
}

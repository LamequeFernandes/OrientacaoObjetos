package view;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaConvidados extends JPanel {

	
	TelaCadastroConvidados telaCadastroConvidados = new TelaCadastroConvidados();
	
	public TelaConvidados() {
		setBackground(new Color(204, 255, 255));
		setBounds(0, 0,533, 379);
		setVisible(true);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Convidados\n");
		lblTitulo.setBounds(12, 12, 509, 46);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 34));
		add(lblTitulo);
		
		JButton botaoCriarConvidados = new JButton("Criar novo(s) convidado(s)");
		botaoCriarConvidados.setBounds(143, 342, 245, 25);
		add(botaoCriarConvidados);
		botaoCriarConvidados.addActionListener(new Botao() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCadastroConvidados frame = new TelaCadastroConvidados();		 
				frame.setVisible(true);	
			}
		});
	}	
	
	public class Botao extends JFrame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TelaCadastroConvidados frame = new TelaCadastroConvidados();		 
			frame.setVisible(true);				
		}		
	}	
}

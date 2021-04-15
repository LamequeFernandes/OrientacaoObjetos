package view;

import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TelaEvento extends JPanel {

	TelaCadastroEvento telaCadastroEvento = new TelaCadastroEvento();
	
	public TelaEvento() {
		setBackground(new Color(204, 255, 255));
		setBounds(0, 0,533, 379);
		setVisible(true);
		setLayout(null);
		
		JLabel lblInicio = new JLabel("Eventos\n");
		lblInicio.setBounds(12, 12, 509, 46);
		lblInicio.setForeground(Color.BLACK);
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setFont(new Font("Fira Code", Font.BOLD, 34));
		add(lblInicio);
		
		JButton botaoCriarEvento = new JButton("Criar novo Evento");
		botaoCriarEvento.setBounds(196, 342, 165, 25);
		add(botaoCriarEvento);
		botaoCriarEvento.addActionListener(new Botao() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCadastroEvento frame = new TelaCadastroEvento();		 
				frame.setVisible(true);	
			}
		});
	}	
	
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	public class Botao extends JFrame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TelaCadastroEvento frame = new TelaCadastroEvento();		 
			frame.setVisible(true);				
		}		
	}	
}

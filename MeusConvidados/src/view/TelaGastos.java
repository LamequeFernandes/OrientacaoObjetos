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

public class TelaGastos extends JPanel {

	
	TelaCadastroEvento telaCadastroEvento = new TelaCadastroEvento();
	
	public TelaGastos() {
		setBackground(new Color(204, 255, 255));
		setBounds(0, 0,533, 379);
		setVisible(true);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Tarefas\n");
		lblTitulo.setBounds(12, 12, 509, 46);
		lblTitulo.setForeground(Color.BLACK);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Fira Code", Font.BOLD, 34));
		add(lblTitulo);
		
		JButton botaoCriarGasto = new JButton("Criar novo Gasto");
		botaoCriarGasto.setBounds(196, 342, 165, 25);
		add(botaoCriarGasto);
		botaoCriarGasto.addActionListener(new Botao() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaCadastroEvento frame = new TelaCadastroEvento();		 
				frame.setVisible(true);	
			}
		});
	}	
	
	public class Botao extends JFrame implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			TelaCadastroEvento frame = new TelaCadastroEvento();		 
			frame.setVisible(true);				
		}		
	}	
}

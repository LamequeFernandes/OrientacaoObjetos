package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class TelaInicio extends JPanel {

	public TelaInicio() {
		setBackground(Color.WHITE);
		setBounds(0, 0, 668, 454);
		setLayout(null);
		
		JLabel lblInicio = new JLabel("Auxiliar de Festas\n");
		lblInicio.setBounds(12, 54, 644, 46);
		lblInicio.setForeground(Color.BLACK);
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setFont(new Font("Fira Code", Font.BOLD, 34));
		add(lblInicio);
		
		JLabel lblOrganizeMelhorOs = new JLabel("Organize melhor o seu Evento");
		lblOrganizeMelhorOs.setBounds(12, 201, 644, 33);
		lblOrganizeMelhorOs.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrganizeMelhorOs.setFont(new Font("Dialog", Font.PLAIN, 16));
		add(lblOrganizeMelhorOs);
		
		JLabel lblCadastreEditeOu = new JLabel("Cadastre, edite ou exclua os Convidados, Gastos e Tarefas de seus Eventos ");
		lblCadastreEditeOu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastreEditeOu.setBounds(12, 235, 644, 33);
		lblCadastreEditeOu.setFont(new Font("Dialog", Font.PLAIN, 14));
		add(lblCadastreEditeOu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/telaInicioFesta.png")));
		lblNewLabel.setBounds(12, 291, 644, 131);
		add(lblNewLabel);
		
		JLabel lblOlSejaBemvindo = new JLabel("Olá, seja Bem-vindo!");
		lblOlSejaBemvindo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblOlSejaBemvindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlSejaBemvindo.setBounds(12, 131, 644, 39);
		add(lblOlSejaBemvindo);
		setVisible(true);
		
	}
}

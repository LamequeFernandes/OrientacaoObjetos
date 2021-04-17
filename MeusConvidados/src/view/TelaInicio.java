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
		setBackground(new Color(112, 128, 144));
		setBounds(0, 0,533, 379);
		setLayout(null);
		
		JLabel lblInicio = new JLabel("Auxiliar de Festas\n");
		lblInicio.setBounds(12, 12, 509, 46);
		lblInicio.setForeground(Color.BLACK);
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setFont(new Font("Fira Code", Font.BOLD, 34));
		add(lblInicio);
		
		JLabel lblOrganizeMelhorOs = new JLabel("Organize melhor os seus Eventos");
		lblOrganizeMelhorOs.setBounds(12, 156, 509, 33);
		lblOrganizeMelhorOs.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrganizeMelhorOs.setFont(new Font("Dialog", Font.PLAIN, 16));
		add(lblOrganizeMelhorOs);
		
		JLabel lblCadastreEditeOu = new JLabel("Cadastre, edite ou exclua os Convidados, Gastos e Tarefas de seus Eventos ");
		lblCadastreEditeOu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastreEditeOu.setBounds(12, 183, 509, 33);
		lblCadastreEditeOu.setFont(new Font("Dialog", Font.PLAIN, 13));
		add(lblCadastreEditeOu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(TelaInicio.class.getResource("/imagens/telaInicioFesta.png")));
		lblNewLabel.setBounds(12, 236, 509, 131);
		add(lblNewLabel);
		
		JLabel lblOlSejaBemvindo = new JLabel("Olá, seja Bem-vindo!");
		lblOlSejaBemvindo.setFont(new Font("Dialog", Font.BOLD, 16));
		lblOlSejaBemvindo.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlSejaBemvindo.setBounds(12, 105, 509, 39);
		add(lblOlSejaBemvindo);
		setVisible(true);
		
	}
}

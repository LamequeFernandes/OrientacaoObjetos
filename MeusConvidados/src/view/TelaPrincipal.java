package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Evento;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.UIManager;

/**
 * Tela Principal do programa.<br>
 * JFrame em que o menu principal está estabelecido e a partir do mesmo pode-se acessar 
 * as demais "abas" do software.
 * 
 * @version 1.0 (Abril 2021)
 * @author Lameque Fernandes
 */

public class TelaPrincipal extends JFrame {

	private JPanel TelaPrincipal;
	private TelaInicio telaInicio;
	private TelaEvento telaEvento;
	private TelaConvidados telaConvidados;
	private TelaTarefas telaTarefas;
	private TelaGastos telaGastos;
	private ArrayList<Evento> eventoArray = new ArrayList<>();
	
	/**
	 * Torna possivel a execução do software.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
	/**
	 * Organiza o JFrame atraves de JPanels, uma para o menu, que é fixo, e outra para o conteudo, para a melhor visualização do usuario. 
	 * Também abrange diversas funcionalidades visuais como os icones da UnB, do Software e das opções presentes no menu principal.<br>
	 */
	public TelaPrincipal() {
		setBackground(new Color(112, 128, 144));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 940, 487);
		setUndecorated(true);
		TelaPrincipal = new JPanel();
		TelaPrincipal.setForeground(new Color(112, 128, 144));
		TelaPrincipal.setBackground(Color.WHITE);
		TelaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TelaPrincipal);
		this.setLocationRelativeTo(null);	
		
		telaInicio = new TelaInicio();
		telaInicio.setBounds(0, 0, 668, 454);
		telaEvento = new TelaEvento(eventoArray);
		telaConvidados = new TelaConvidados(eventoArray);
		telaTarefas = new TelaTarefas(eventoArray);
		telaGastos = new TelaGastos(eventoArray);
		
		JLabel lblSair = new JLabel("X");
		lblSair.setBounds(910, 0, 20, 20);
		lblSair.setHorizontalAlignment(SwingConstants.CENTER);
		lblSair.setForeground(Color.BLACK);
		lblSair.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fecha o programa?", "Confirme", JOptionPane.YES_NO_OPTION) == 0)
					TelaPrincipal.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				lblSair.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent arg0) {
				lblSair.setForeground(Color.BLACK);
			}
		});
		TelaPrincipal.setLayout(null);
		TelaPrincipal.add(lblSair);
		
		
		JPanel painelMenu = new JPanel();
		painelMenu.setBounds(0, 0, 250, 555);
		painelMenu.setForeground(new Color(112, 128, 144));
		painelMenu.setBackground(UIManager.getColor("ColorChooser.foreground"));
		TelaPrincipal.add(painelMenu);
		painelMenu.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.setBounds(12, 37, 228, 115);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/logo.png")));
		painelMenu.add(logo);
		
		JLabel iconeUnb = new JLabel("");
		iconeUnb.setBounds(0, 376, 250, 70);
		iconeUnb.setHorizontalAlignment(SwingConstants.CENTER);
		iconeUnb.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/unbLogoPequena.png")));
		painelMenu.add(iconeUnb);
		
		JPanel painelInicio = new JPanel();
		painelInicio.setForeground(Color.DARK_GRAY);
		painelInicio.addMouseListener(new PanelButtonMouseAdapter(painelInicio){
			@Override
			public void mouseClicked(MouseEvent e) {
				menu(telaInicio);
			}
		});
		painelInicio.setBackground(UIManager.getColor("EditorPane.caretForeground"));
		painelInicio.setBounds(0, 164, 250, 40);
		painelMenu.add(painelInicio);
		painelInicio.setLayout(null);
		
		JLabel lblInicio = new JLabel("INÍCIO");
		lblInicio.setBounds(76, 0, 174, 40);
		lblInicio.setForeground(new Color(255, 255, 255));
		lblInicio.setFont(new Font("Dialog", Font.BOLD, 14));
		painelInicio.add(lblInicio);
		
		JLabel lblIconeInicio = new JLabel("");
		lblIconeInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconeInicio.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/iconeHome.png")));
		lblIconeInicio.setBounds(20, 0, 40, 40);
		painelInicio.add(lblIconeInicio);
		
		JPanel painelEventos = new JPanel();
		painelEventos.addMouseListener(new PanelButtonMouseAdapter(painelEventos) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu(telaEvento);
			}
		});
		painelEventos.setBackground(UIManager.getColor("EditorPane.caretForeground"));
		painelEventos.setBounds(0, 204, 250, 40);
		painelMenu.add(painelEventos);
		painelEventos.setLayout(null);
		
		JLabel lblEventos = new JLabel("EVENTOS");
		lblEventos.setBounds(76, 0, 174, 40);
		lblEventos.setForeground(Color.WHITE);
		lblEventos.setFont(new Font("Dialog", Font.BOLD, 14));
		painelEventos.add(lblEventos);
		
		JLabel lblIconeEventos = new JLabel("");
		lblIconeEventos.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/iconeEventos.png")));
		lblIconeEventos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconeEventos.setBounds(20, 0, 40, 40);
		painelEventos.add(lblIconeEventos);
		
		JPanel painelConvidados = new JPanel();
		painelConvidados.addMouseListener(new PanelButtonMouseAdapter(painelConvidados){
			@Override
			public void mouseClicked(MouseEvent e) {
				menu(telaConvidados);
			}
		});
		painelConvidados.setBackground(UIManager.getColor("EditorPane.caretForeground"));
		painelConvidados.setBounds(0, 244, 250, 40);
		painelMenu.add(painelConvidados);
		painelConvidados.setLayout(null);
		
		JLabel lblConvidados = new JLabel("CONVIDADOS");
		lblConvidados.setBounds(76, 0, 174, 40);
		lblConvidados.setForeground(Color.WHITE);
		lblConvidados.setFont(new Font("Dialog", Font.BOLD, 14));
		painelConvidados.add(lblConvidados);
		
		JLabel lblIconeConvidados = new JLabel("");
		lblIconeConvidados.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconeConvidados.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/iconeConvidados.png")));
		lblIconeConvidados.setBounds(20, 0, 40, 40);
		painelConvidados.add(lblIconeConvidados);
		
		JPanel painelTarefas = new JPanel();
		painelTarefas.addMouseListener(new PanelButtonMouseAdapter(painelTarefas){
			@Override
			public void mouseClicked(MouseEvent e) {
				menu(telaTarefas);
			}
		});
		painelTarefas.setBackground(UIManager.getColor("EditorPane.caretForeground"));
		painelTarefas.setBounds(0, 284, 250, 40);
		painelMenu.add(painelTarefas);
		painelTarefas.setLayout(null);
		
		JLabel lblTarefas = new JLabel("TAREFAS");
		lblTarefas.setBounds(76, 0, 174, 40);
		lblTarefas.setForeground(Color.WHITE);
		lblTarefas.setFont(new Font("Dialog", Font.BOLD, 14));
		painelTarefas.add(lblTarefas);
		
		JLabel lblIconeTarefas = new JLabel("");
		lblIconeTarefas.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconeTarefas.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/iconeTarefas.png")));
		lblIconeTarefas.setBounds(20, 0, 40, 40);
		painelTarefas.add(lblIconeTarefas);
		
		JPanel painelGastos = new JPanel();
		painelGastos.addMouseListener(new PanelButtonMouseAdapter(painelGastos){
			@Override
			public void mouseClicked(MouseEvent e) {
				menu(telaGastos);
			}
		});
		painelGastos.setBackground(UIManager.getColor("EditorPane.caretForeground"));
		painelGastos.setBounds(0, 324, 250, 40);
		painelMenu.add(painelGastos);
		painelGastos.setLayout(null);
		
		JLabel lblGastos = new JLabel("GASTOS");
		lblGastos.setBounds(76, 0, 174, 40);
		lblGastos.setForeground(Color.WHITE);
		lblGastos.setFont(new Font("Dialog", Font.BOLD, 14));
		painelGastos.add(lblGastos);
		
		JLabel lblIconeGastos = new JLabel("");
		lblIconeGastos.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconeGastos.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/imagens/iconeGastos.png")));
		lblIconeGastos.setBounds(20, 0, 40, 40);
		painelGastos.add(lblIconeGastos);
		

		JPanel panelConteudo = new JPanel();
		panelConteudo.setBounds(262, 22, 668, 454);
		TelaPrincipal.add(panelConteudo);
		
		panelConteudo.add(telaInicio);
		panelConteudo.add(telaEvento);
		panelConteudo.add(telaConvidados);
		panelConteudo.add(telaTarefas);
		panelConteudo.add(telaGastos);
		panelConteudo.setLayout(null);
		
		menu(telaInicio);		
		
	}
	
	public void menu(JPanel panel) {
		telaInicio.setVisible(false);
		telaEvento.setVisible(false);
		telaConvidados.setVisible(false);
		telaTarefas.setVisible(false);
		telaGastos.setVisible(false);
		
		panel.setVisible(true);
	}
	
	/**
	 * adiciona funcionalidades ao mouse, como por exemplo, mudar de cor ao passar o mouse em cima de uma label.
	 */
	private class PanelButtonMouseAdapter extends MouseAdapter{		
		JPanel painel;
		public PanelButtonMouseAdapter(JPanel painel) {
			this.painel = painel;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			painel.setBackground(new Color(105, 105, 105));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			painel.setBackground(UIManager.getColor("ColorChooser.foreground"));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			painel.setBackground(UIManager.getColor("ColorChooser.foreground"));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			painel.setBackground(new Color(105, 105, 105));
		} 
	}
}

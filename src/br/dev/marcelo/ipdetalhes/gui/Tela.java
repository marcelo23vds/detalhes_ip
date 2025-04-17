package br.dev.marcelo.ipdetalhes.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	private JLabel lblEntrada;
	private JLabel lblSeparador1;
	private JLabel lblSeparador2;
	private JLabel lblSeparador3;
	private JLabel lblSeparador4;
	private JTextField txtPrimeiroOcteto;
	private JTextField txtSegundoOcteto;
	private JTextField txtTerceiroOcteto;
	private JTextField txtQuartoOcteto;
	private JTextField txtMascara;
	private JButton buttonVerificar;
	private JLabel lblClasse;
	private JLabel lblDecimal;
	private JLabel lblBinario;
	private JLabel lblIpsDisponiveis;
	private JLabel lblErro;
	private String resultadoClasse;
	private String resultadoDecimal;
	private String resultadoBinario;
	private String resultadoIpsDisponiveis;

	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(390, 305);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		lblEntrada = new JLabel();
		lblEntrada.setText("DIGITE ABAIXO UM ENDEREÇO IP");
		lblEntrada.setBounds(100, 20, 352, 30);
		
		txtPrimeiroOcteto = new JTextField();
		txtPrimeiroOcteto.setBounds(25, 70, 52, 30);
		
		lblSeparador1 = new JLabel();
		lblSeparador1.setText(".");
		lblSeparador1.setBounds(81, 78, 52, 30);
		
		txtSegundoOcteto = new JTextField();
		txtSegundoOcteto.setBounds(90, 70, 52, 30);
		
		lblSeparador2 = new JLabel();
		lblSeparador2.setText(".");
		lblSeparador2.setBounds(146, 78, 52, 30);
		
		txtTerceiroOcteto = new JTextField();
		txtTerceiroOcteto.setBounds(155, 70, 52, 30);
		
		lblSeparador3 = new JLabel();
		lblSeparador3.setText(".");
		lblSeparador3.setBounds(211, 78, 52, 30);
		
		txtQuartoOcteto = new JTextField();
		txtQuartoOcteto.setBounds(220, 70, 52, 30);
		
		lblSeparador4 = new JLabel();
		lblSeparador4.setText("/");
		lblSeparador4.setBounds(282, 78, 52, 30);
		
		txtMascara = new JTextField();
		txtMascara.setBounds(297, 70, 32, 30);
		
		buttonVerificar = new JButton();
		buttonVerificar.setText("VERIFICAR DETALHES DO ENDEREÇO IP");
		buttonVerificar.setBounds(50, 120, 262, 30);
		
		lblClasse = new JLabel();
		lblClasse.setBounds(158, 210, 102, 30);
		
		lblDecimal = new JLabel();
		lblDecimal.setBounds(158, 210, 102, 30);
		
		lblBinario = new JLabel();
		lblBinario.setBounds(158, 210, 102, 30);
		
		lblIpsDisponiveis = new JLabel();
		lblIpsDisponiveis.setBounds(158, 210, 102, 30);
		
		lblErro = new JLabel();
		lblErro.setBounds(107, 210, 202, 30);
		
		tela.getContentPane().add(lblEntrada);
		tela.getContentPane().add(txtPrimeiroOcteto);
		tela.getContentPane().add(lblSeparador1);
		tela.getContentPane().add(txtSegundoOcteto);
		tela.getContentPane().add(lblSeparador2);
		tela.getContentPane().add(txtTerceiroOcteto);
		tela.getContentPane().add(lblSeparador3);
		tela.getContentPane().add(txtQuartoOcteto);
		tela.getContentPane().add(lblSeparador4);
		tela.getContentPane().add(txtMascara);
		tela.getContentPane().add(buttonVerificar);

//		tela.getContentPane().add(lblErro);
		
//		buttonVerificar.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				
//			}
//		});
		
		tela.setVisible(true);
		
	}
	
}

package br.dev.marcelo.ipdetalhes.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.marcelo.ipdetalhes.model.VerificarEnderecoIp;
import br.dev.marcelo.ipdetalhes.model.VerificarMascara;

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
		tela.setSize(530, 340);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("DETALHES DE ENDEREÇO IP");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		lblEntrada = new JLabel();
		lblEntrada.setText("DIGITE ABAIXO UM ENDEREÇO IP");
		lblEntrada.setBounds(167, 20, 352, 30);
		
		txtPrimeiroOcteto = new JTextField();
		txtPrimeiroOcteto.setBounds(105, 70, 52, 30);
		
		lblSeparador1 = new JLabel();
		lblSeparador1.setText(".");
		lblSeparador1.setBounds(161, 78, 52, 30);
		
		txtSegundoOcteto = new JTextField();
		txtSegundoOcteto.setBounds(170, 70, 52, 30);
		
		lblSeparador2 = new JLabel();
		lblSeparador2.setText(".");
		lblSeparador2.setBounds(226, 78, 52, 30);
		
		txtTerceiroOcteto = new JTextField();
		txtTerceiroOcteto.setBounds(235, 70, 52, 30);
		
		lblSeparador3 = new JLabel();
		lblSeparador3.setText(".");
		lblSeparador3.setBounds(291, 78, 52, 30);
		
		txtQuartoOcteto = new JTextField();
		txtQuartoOcteto.setBounds(300, 70, 52, 30);
		
		lblSeparador4 = new JLabel();
		lblSeparador4.setText("/");
		lblSeparador4.setBounds(362, 78, 52, 30);
		
		txtMascara = new JTextField();
		txtMascara.setBounds(377, 70, 32, 30);
		
		buttonVerificar = new JButton();
		buttonVerificar.setText("EXIBIR DETALHES");
		buttonVerificar.setBounds(127, 120, 262, 30);
		
		lblClasse = new JLabel();
		lblClasse.setBounds(85, 170, 370, 30);
		
		lblDecimal = new JLabel();
		lblDecimal.setBounds(85, 190, 370, 30);
		
		lblBinario = new JLabel();
		lblBinario.setBounds(85, 210, 370, 30);
		
		lblIpsDisponiveis = new JLabel();
		lblIpsDisponiveis.setBounds(85, 230, 370, 30);
		
		lblErro = new JLabel();
		lblErro.setBounds(200, 170, 202, 30);
		
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
		
		tela.getContentPane().add(lblClasse);
		tela.getContentPane().add(lblDecimal);
		tela.getContentPane().add(lblBinario);
		tela.getContentPane().add(lblIpsDisponiveis);

		tela.getContentPane().add(lblErro);
		
		
		
		buttonVerificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String entradaPrimeiroOcteto = txtPrimeiroOcteto.getText();
				String entradaSegundoOcteto = txtSegundoOcteto.getText();
				String entradaTerceiroOcteto = txtTerceiroOcteto.getText();
				String entradaQuartoOcteto = txtQuartoOcteto.getText();
				String entradaMascara = txtMascara.getText();
				
//				verificando abaixo se o ip e mascara digitados pelo usuario são numeros .*[^0-9]. 
//				se possuem o limite de caracteres .{4,} 
//				e também se estão vazios "".
				
				if (entradaPrimeiroOcteto.matches(".*[^0-9].*") || entradaPrimeiroOcteto.matches("") || entradaPrimeiroOcteto.matches(".{4,}") ||
					entradaSegundoOcteto.matches (".*[^0-9].*") || entradaSegundoOcteto.matches ("") || entradaSegundoOcteto.matches (".{4,}") ||
					entradaTerceiroOcteto.matches(".*[^0-9].*") || entradaTerceiroOcteto.matches("") || entradaTerceiroOcteto.matches(".{4,}") ||
					entradaQuartoOcteto.matches  (".*[^0-9].*") || entradaQuartoOcteto.matches  ("") || entradaQuartoOcteto.matches  (".{4,}") ||
					entradaMascara.matches       (".*[^0-9].*") || entradaMascara.matches	    ("") || entradaMascara.matches       (".{3,}") ) 
				{
					
					lblErro.setText("DIGITE UM IP VÁLIDO!");
					lblClasse.setText("");
					lblDecimal.setText("");
					lblBinario.setText("");
					lblIpsDisponiveis.setText("");
					
				} else {
							
					double entradaPrimeiroOctetoDouble = Double.parseDouble(entradaPrimeiroOcteto);
					VerificarEnderecoIp endereco = new VerificarEnderecoIp();
					endereco.setPrimeiroOcteto(entradaPrimeiroOctetoDouble);
					
					resultadoClasse = endereco.verificarClasse();
					lblClasse.setText(resultadoClasse);
					lblErro.setText("");
					
					
					
					double entradaMascaraDouble = Double.parseDouble(entradaMascara);
					VerificarMascara mascara = new VerificarMascara();
					mascara.setMascara(entradaMascaraDouble);
					
					resultadoDecimal = mascara.verificarDecimal();
					lblDecimal.setText(resultadoDecimal);
					lblErro.setText("");
					
					resultadoBinario = mascara.verificarBinario();
					lblBinario.setText(resultadoBinario);
					lblErro.setText("");
					
					resultadoIpsDisponiveis = mascara.verificarIpsDisponiveis();
					lblIpsDisponiveis.setText("Hosts disponiveis: " + resultadoIpsDisponiveis);
					lblErro.setText("");
					
				}
				
			}
		});
		
		tela.setVisible(true);
		
	}
	
}

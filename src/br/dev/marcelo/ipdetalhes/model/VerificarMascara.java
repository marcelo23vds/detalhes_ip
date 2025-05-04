package br.dev.marcelo.ipdetalhes.model;

import java.math.BigDecimal;

public class VerificarMascara {

	private int mascara;
	
	public double getMascara() {
		return mascara;
	}

	public void setMascara(int mascara) {
		this.mascara = mascara;
	}
	
	public String verificarDecimal() {
		
		if (mascara < 8 || mascara > 32) {
			
			return "Máscara inválida!";
					
		} else {
			
//			0xFFFFFFFF é um valor numérico, usado para operações com bits.
			int mascaraHexadecimal = 0xFFFFFFFF << (32 - mascara);
			
//			quebrando em 4 octetos e enviando para direita os bits "ligados" em cada um dos octetos com >>> 
//			e com & 0xFF limpar os bits restantes a esquerda
		    int octeto1 = (mascaraHexadecimal >>> 24) & 0xFF;
		    int octeto2 = (mascaraHexadecimal >>> 16) & 0xFF;
		    int octeto3 = (mascaraHexadecimal >>> 8) & 0xFF;
		    int octeto4 = mascaraHexadecimal & 0xFF;
		    
//		    imprimindo apenas os bits ligados em cada octeto, deixando assim na ordem do padrão de uma máscara 
		    return "Máscara em Decimal: " + octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
		}
 
	} 
	
	public String verificarBinario() {
		
		if (mascara < 8 || mascara > 32) {
			
			return "Máscara inválida!";
			
		} else {
			
			int mascaraHexadecimal = 0xFFFFFFFF << (32 - mascara);
			
//			os tipos Int sao convertidos para String 
//			e o String.format("%8s", ...) formata para ter 8 caracteres em cada octeto
//			o >>> envia para direita os bits ligados e o & 0xFF limpa os da esquerda
//			o replace vai substituir o que estiver vazio, ou seja, onde seriam os bits desligados por 0
	        String octeto1 = String.format("%8s", Integer.toBinaryString((mascaraHexadecimal >>> 24) & 0xFF)).replace(' ', '0');
	        String octeto2 = String.format("%8s", Integer.toBinaryString((mascaraHexadecimal >>> 16) & 0xFF)).replace(' ', '0');
	        String octeto3 = String.format("%8s", Integer.toBinaryString((mascaraHexadecimal >>> 8) & 0xFF)).replace(' ', '0');
	        String octeto4 = String.format("%8s", Integer.toBinaryString(mascaraHexadecimal & 0xFF)).replace(' ', '0');
			
			return "Máscara em Binario: " + octeto1 + "." + octeto2 + "." + octeto3 + "." + octeto4;
			
		}
		
	}
	
	public String verificarIpsDisponiveis() {
		
		if (mascara < 8 || mascara > 32) {
			
			String mascaraInvalida = "---";
			return mascaraInvalida;
			
		} else if (mascara == 32) {
			
//			retornar 0 porque a formula resultaria em -1 para o caso da mascara /32, o que seria incorreto
			return "0";
			
		} else {
			
			double ipsDisponiveis = 0;
			ipsDisponiveis = Math.pow(2, (32 - mascara)) - 2;
			
//			passando o valor da variavel Double para BigDecimal, pois o Double não suporta o valor de uma possivel mascara /8 e também o BigDecimal converte para String formatado de uma maneira mais legivel
			BigDecimal ipsDisponiveisBigDecimal = new BigDecimal(ipsDisponiveis);
			return ipsDisponiveisBigDecimal.toString(); 
		}
		
	}
	
} 

package br.dev.marcelo.ipdetalhes.model;

import java.math.BigDecimal;

public class EnderecoIp {

	private double primeiroOcteto;
	private int mascara;
	private String classe;
	
	public double getPrimeiroOcteto() {
		return primeiroOcteto;
	}
	public void setPrimeiroOcteto(double primeiroOcteto) {
		this.primeiroOcteto = primeiroOcteto;
	}
	public int getMascara() {
		return mascara;
	}
	public void setMascara(int mascara) {
		this.mascara = mascara;
	}
	
	public String getClasse() {
		
		if (primeiroOcteto >= 0 && primeiroOcteto <= 126) {
			classe = "IP de Classe A";
		} else if (primeiroOcteto == 127) {
			classe = "IP Reservado para loopback";
		} else if (primeiroOcteto >= 128 && primeiroOcteto <= 191) {
			classe = "IP de Classe B";
		} else if (primeiroOcteto >= 192 && primeiroOcteto <= 223) {
			classe = "IP de Classe C";
		} else if (primeiroOcteto >= 224 && primeiroOcteto <= 239) {
			classe = "IP de Classe D - reservada para multicast";
		} else if (primeiroOcteto >= 240 && primeiroOcteto <= 255) {
			classe = "IP de Classe E - reservada para uso futuro e experimental";
		} else {
			classe = "IP Inválido!";
		}
			
		return classe;
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

	public String verificarSubRedes() {
		
		int bitsClasse;
		
		if (primeiroOcteto >= 0 && primeiroOcteto <= 126) {
			bitsClasse = 8;
		} else if (primeiroOcteto >= 127 && primeiroOcteto <= 191) {
			bitsClasse = 16;
		} else if (primeiroOcteto >= 192 && primeiroOcteto <= 223) {
			bitsClasse = 24;
		}  else {
			bitsClasse = 0;
		}
		
		if (bitsClasse == 0) {
			
			return "Sub-Redes: " + (int) Math.pow(2, mascara - bitsClasse) + " (Utilize classe A, B ou C)";
			
		} else {
			
			return "Sub-Redes: " + (int) Math.pow(2, mascara - bitsClasse);
			
		}
	       
	}
}

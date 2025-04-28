package br.dev.marcelo.ipdetalhes.model;

import java.math.BigDecimal;

public class VerificarMascara {

	private double mascara;
	
	public double getMascara() {
		return mascara;
	}

	public void setMascara(double mascara) {
		this.mascara = mascara;
	}
	
	public String verificarDecimal() {
		String decimal = null;
		
		if (mascara == 32) {
            decimal = "Mascara em decimal: 255.255.255.255";
        } else if (mascara == 31) {
            decimal = "Mascara em decimal: 255.255.255.254";
        } else if (mascara == 30) {
            decimal = "Mascara em decimal: 255.255.255.252";
        } else if (mascara == 29) {
            decimal = "Mascara em decimal: 255.255.255.248";
        } else if (mascara == 28) {
            decimal = "Mascara em decimal: 255.255.255.240";
        } else if (mascara == 27) {
            decimal = "Mascara em decimal: 255.255.255.224";
        } else if (mascara == 26) {
            decimal = "Mascara em decimal: 255.255.255.192";
        } else if (mascara == 25) {
            decimal = "Mascara em decimal: 255.255.255.128";
        } else if (mascara == 24) {
            decimal = "Mascara em decimal: 255.255.255.0";
        } else if (mascara == 23) {
            decimal = "Mascara em decimal: 255.255.254.0";
        } else if (mascara == 22) {
            decimal = "Mascara em decimal: 255.255.252.0";
        } else if (mascara == 21) {
            decimal = "Mascara em decimal: 255.255.248.0";
        } else if (mascara == 20) {
            decimal = "Mascara em decimal: 255.255.240.0";
        } else if (mascara == 19) {
            decimal = "Mascara em decimal: 255.255.224.0";
        } else if (mascara == 18) {
            decimal = "Mascara em decimal: 255.255.192.0";
        } else if (mascara == 17) {
            decimal = "Mascara em decimal: 255.255.128.0";
        } else if (mascara == 16) {
            decimal = "Mascara em decimal: 255.255.0.0";
        } else if (mascara == 15) {
            decimal = "Mascara em decimal: 255.254.0.0";
        } else if (mascara == 14) {
            decimal = "Mascara em decimal: 255.252.0.0";
        } else if (mascara == 13) {
            decimal = "Mascara em decimal: 255.248.0.0";
        } else if (mascara == 12) {
            decimal = "Mascara em decimal: 255.240.0.0";
        } else if (mascara == 11) {
            decimal = "Mascara em decimal: 255.224.0.0";
        } else if (mascara == 10) {
            decimal = "Mascara em decimal: 255.192.0.0";
        } else if (mascara == 9) {
            decimal = "Mascara em decimal: 255.128.0.0";
        } else if (mascara == 8) {
            decimal = "Mascara em decimal: 255.0.0.0";
        } else {
            decimal = "Máscara inválida!";
        }
		
		return decimal;
	}
	
	public String verificarBinario() {
		String binario = null;
		
		if (mascara == 32) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11111111";
        } else if (mascara == 31) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11111110";
        } else if (mascara == 30) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11111100";
        } else if (mascara == 29) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11111000";
        } else if (mascara == 28) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11110000";
        } else if (mascara == 27) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11100000";
        } else if (mascara == 26) {
            binario = "Mascara em binario: 11111111.11111111.11111111.11000000";
        } else if (mascara == 25) {
            binario = "Mascara em binario: 11111111.11111111.11111111.10000000";
        } else if (mascara == 24) {
            binario = "Mascara em binario: 11111111.11111111.11111111.00000000";
        } else if (mascara == 23) {
            binario = "Mascara em binario: 11111111.11111111.11111110.00000000";
        } else if (mascara == 22) {
            binario = "Mascara em binario: 11111111.11111111.11111100.00000000";
        } else if (mascara == 21) {
            binario = "Mascara em binario: 11111111.11111111.11111000.00000000";
        } else if (mascara == 20) {
            binario = "Mascara em binario: 11111111.11111111.11110000.00000000";
        } else if (mascara == 19) {
            binario = "Mascara em binario: 11111111.11111111.11100000.00000000";
        } else if (mascara == 18) {
            binario = "Mascara em binario: 11111111.11111111.11000000.00000000";
        } else if (mascara == 17) {
            binario = "Mascara em binario: 11111111.11111111.10000000.00000000";
        } else if (mascara == 16) {
            binario = "Mascara em binario: 11111111.11111111.00000000.00000000";
        } else if (mascara == 15) {
            binario = "Mascara em binario: 11111111.11111110.00000000.00000000";
        } else if (mascara == 14) {
            binario = "Mascara em binario: 11111111.11111100.00000000.00000000";
        } else if (mascara == 13) {
            binario = "Mascara em binario: 11111111.11111000.00000000.00000000";
        } else if (mascara == 12) {
            binario = "Mascara em binario: 11111111.11110000.00000000.00000000";
        } else if (mascara == 11) {
            binario = "Mascara em binario: 11111111.11100000.00000000.00000000";
        } else if (mascara == 10) {
            binario = "Mascara em binario: 11111111.11000000.00000000.00000000";
        } else if (mascara == 9) {
            binario = "Mascara em binario: 11111111.10000000.00000000.00000000";
        } else if (mascara == 8) {
            binario = "Mascara em binario: 11111111.00000000.00000000.00000000";
        } else {
            binario = "Máscara inválida!";
        }
		
		return binario;
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

package br.dev.marcelo.ipdetalhes.model;

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
        } else if (mascara == 8) {
            decimal = "Mascara em decimal: 255.0.0.0";
        } else if (mascara == 0) {
            decimal = "Mascara em decimal: 0.0.0.0";
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
        } else if (mascara == 8) {
            binario = "Mascara em binario: 11111111.00000000.00000000.00000000";
        } else if (mascara == 0) {
            binario = "Mascara em binario: 00000000.00000000.00000000.00000000";
        } else {
            binario = "Máscara inválida!";
        }
		
		return binario;
	}
	
	public String verificarIpsDisponiveis() {
		String ipsDisponiveis = null;
		
		if (mascara == 32) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 0";
        } else if (mascara == 31) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 0";
        } else if (mascara == 30) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 2";
        } else if (mascara == 29) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 6";
        } else if (mascara == 28) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 14";
        } else if (mascara == 27) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 30";
        } else if (mascara == 26) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 62";
        } else if (mascara == 25) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 126";
        } else if (mascara == 24) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 254";
        } else if (mascara == 23) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 510";
        } else if (mascara == 22) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 1022";
        } else if (mascara == 21) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 2046";
        } else if (mascara == 20) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 4094";
        } else if (mascara == 19) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 8190";
        } else if (mascara == 18) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 16382";
        } else if (mascara == 17) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 32766";
        } else if (mascara == 16) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 65534";
        } else if (mascara == 8) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 16777214";
        } else if (mascara == 0) {
            ipsDisponiveis = "Quantidade de endereços IP disponiveis: 4294967294";
        } else {
            ipsDisponiveis = "Máscara inválida!";
        }
		
		return ipsDisponiveis;
	}
	
}

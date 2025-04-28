package br.dev.marcelo.ipdetalhes.model;

public class VerificarEnderecoIp {
	
	private double primeiroOcteto;
	
	public double getPrimeiroOcteto() {
		return primeiroOcteto;
	}
	public void setPrimeiroOcteto(double primeiroOcteto) {
		this.primeiroOcteto = primeiroOcteto;
	}
	
	public String verificarClasse() {
		
		String classe = null;
		
		if (primeiroOcteto >= 0 && primeiroOcteto <= 126) {
			classe = "Classe A";
		} else if (primeiroOcteto == 127) {
			classe = "Reservado para loopback";
		} else if (primeiroOcteto >= 128 && primeiroOcteto <= 191) {
			classe = "Classe B";
		} else if (primeiroOcteto >= 192 && primeiroOcteto <= 223) {
			classe = "Classe C";
		} else if (primeiroOcteto >= 224 && primeiroOcteto <= 239) {
			classe = "Classe D - reservada para multicast";
		} else if (primeiroOcteto >= 240 && primeiroOcteto <= 255) {
			classe = "Classe E - reservada para uso futuro e experimental";
		} else {
			classe = "Não faz parte de uma classe";
		}
			
		return classe;
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
}

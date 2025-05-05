package br.dev.marcelo.ipdetalhes.model;

public class VerificarSubRedes {

	private double primeiroOcteto;
	private int mascara;
	
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
	
	public String calcularSubRedes() {
		
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
			
			return (int) Math.pow(2, mascara - bitsClasse) + " (Utilize classe A, B ou C em ambiente real)";
			
		} else {
			
			return "Sub-Redes: " + (int) Math.pow(2, mascara - bitsClasse);
			
		}
		
	       
	}
	
}

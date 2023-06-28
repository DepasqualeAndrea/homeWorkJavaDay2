package es2;

public class Sim {
	String numero;
	double credito;
	Chiamata[] chiamate;
	int numChiamate;

	public Sim(String numero) {
		this.numero = numero;
		this.credito = 0;
		this.chiamate = new Chiamata[6];
		this.numChiamate = 0;
	}

	public void moreCredito(double credito) {
		this.credito += credito;
	}

	public void stampaSim() {
		System.out.println("Dati Sim: telefono " + numero + "credito residuo: " + credito);
		System.out.println("Ultime chiamate effettuate: ");
		for (int i = 0; i < numChiamate; i++) {
			System.out.println("phone called: " + chiamate[i].numChiamato);
			System.out.println("Duration: " + chiamate[i].durata + " min");
		}
		System.out.println("");
	}

	public void addCall(Chiamata calls) {
		if (numChiamate < 5) {
			chiamate[numChiamate] = calls;
			numChiamate++;
		} else {
			for (int i = 0; i < 5; i++) {
				chiamate[i] = chiamate[i + 1];
			}
			chiamate[5] = calls;
		}
	}

}

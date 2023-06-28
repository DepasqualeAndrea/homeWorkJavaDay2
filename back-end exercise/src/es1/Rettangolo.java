package es1;

public class Rettangolo {

	double altezza;
	double larghezza;

	public Rettangolo(double altezza, double larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;
	}

	public Rettangolo() {
	};

	public double perimetro(Rettangolo ret) {
		return (ret.altezza + ret.larghezza) * 2;
	}

	public double area(Rettangolo ret) {
		return ret.altezza * ret.larghezza;
	}

	public void stampaRettangolo(Rettangolo ret) {
		System.out.println("il risultato del perimetro è:" + ret.perimetro(ret));
		System.out.println("il risultato dell'area è:" + ret.area(ret));

	}

	public void stampaDueRettangoli(Rettangolo ret1, Rettangolo ret2) {
		System.out.println("Rettangol 1: perimetro = " + perimetro(ret1) + "\ned area = " + area(ret1));
		System.out.println("Rettangolo 2: perimetro = " + perimetro(ret2) + "\ned area = " + area(ret2));
		System.out.println("Perimetro totale: " + (perimetro(ret1) + perimetro(ret2)));
		System.out.println("Area totale: " + (area(ret1) + area(ret2)));
	}
}

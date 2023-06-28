package es1;

public class App {
	public static void main(String[] args) {
		Rettangolo ret = new Rettangolo();
		Rettangolo rettangolo = new Rettangolo(2, 9);
		Rettangolo rettangolo1 = new Rettangolo(5, 10);
		stampArea(rettangolo);
		stampPerimetro(rettangolo);

		ret.stampaRettangolo(rettangolo);
		ret.stampaRettangolo(rettangolo1);
		ret.stampaDueRettangoli(rettangolo, rettangolo1);

	}

	public static void stampArea(Rettangolo ret) {
		System.out.println("il risultato dell'area è:" + ret.area(ret));
	}

	public static void stampPerimetro(Rettangolo ret) {
		System.out.println("il risultato del perimetro è:" + ret.perimetro(ret));
	}

	public static void stampRettangolo(Rettangolo rettangolo) {
		System.out.println("il primo rettangolo ha perimetro:" + rettangolo.perimetro(rettangolo) + "/n ed area: "
				+ rettangolo.area(rettangolo));
	}
}

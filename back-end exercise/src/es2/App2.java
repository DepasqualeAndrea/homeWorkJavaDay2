package es2;

public class App2 {

	public static void main(String[] args) {
		Sim sim1 = new Sim("3334037527");

		Chiamata chiamata1 = new Chiamata("3290067312", 2);
		Chiamata chiamata2 = new Chiamata("3920056125", 15);
		Chiamata chiamata3 = new Chiamata("3319832877", 25);
		Chiamata chiamata4 = new Chiamata("3395821789", 1);
		Chiamata chiamata5 = new Chiamata("3201867317", 7);

		sim1.moreCredito(10);

		sim1.addCall(chiamata1);
		sim1.addCall(chiamata2);
		sim1.addCall(chiamata3);
		sim1.addCall(chiamata4);
		sim1.addCall(chiamata5);

		sim1.stampaSim();
	}

}

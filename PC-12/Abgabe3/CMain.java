package Abgabe3;
public class CMain {

	public static void main(String[] args) {

		IFahrzeug auto = new CAuto("rot", "trabbi", 4, 110, EAutoTyp.SEDAN);
		IFahrzeug suv = new CSuv("blau", "suv", 7, 100, true);

		auto.schalte(1);
		auto.beschleunige(30);
		System.out.println(((CAuto) auto).getAktGeschwindigkeit());

		auto.schalte(2);
		auto.beschleunige(60);
		System.out.println(((CAuto) auto).getAktGeschwindigkeit());

		auto.bremse(50);
		System.out.println(((CAuto) auto).getAktGeschwindigkeit());
		System.out.println(auto.toString());

		suv.schalte(1);
		suv.beschleunige(35);
		System.out.println(((CAuto) suv).getAktGeschwindigkeit());

		suv.schalte(2);
		suv.beschleunige(90);
		System.out.println(((CAuto) suv).getAktGeschwindigkeit());

		suv.bremse(35);
		System.out.println(((CAuto) suv).getAktGeschwindigkeit());
		System.out.println(suv.toString());
	}

}
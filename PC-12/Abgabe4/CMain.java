package Abgabe4;

public class CMain {

	public static void main(String[] args) {

		CLkw lkw = new CLkw("grün", "CAT", 6, 120, 12);
		lkw.schalte(1);
		lkw.beschleunige(25);
		System.out.println(lkw.getAktGeschwindigkeit());
		System.out.println(lkw.toString());

		CMotorrad motorrad = new CMotorrad("gelb", "Harley", 4, 300, EMotoradTyp.CRUZER, true);
		motorrad.schalte(2);
		motorrad.beschleunige(77);
		System.out.println(motorrad.getAktGeschwindigkeit());
		System.out.println(motorrad.toString());

		IFahrzeug auto = new CAuto("rot", "trabbi", 4, 110, EAutoTyp.SEDAN);
		auto.schalte(1);
		auto.beschleunige(30);
		System.out.println(((CAuto) auto).getAktGeschwindigkeit());
		System.out.println(auto.toString());

		IFahrzeug suv = new CSuv("blau", "suv", 7, 100, true);
		suv.schalte(1);
		suv.beschleunige(35);
		System.out.println(((CAuto) suv).getAktGeschwindigkeit());

		suv.bremse(35);
		System.out.println(((CAuto) suv).getAktGeschwindigkeit());
		System.out.println(suv.toString());

	}

}
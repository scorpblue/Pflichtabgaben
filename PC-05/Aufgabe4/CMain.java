
public class CMain {

    public static void main(String[] p_args) {

        IFahrzeug car = new CAuto("rot", "VW", 5, 250);
        IFahrzeug suv = new CSuv("rot", "VW", 5, 250, false);
        IFahrzeug lkw = new CLkw("gelb", "Man", 5, 120, 20);
        IFahrzeug moto = new CMotorrad("blau", "Yamaha", 5, 130, 2);

        car.beschleunige(2);
        car.bremse(3);
        car.schalte(4);

        suv.beschleunige(5);
        suv.bremse(6);
        suv.schalte(7);

        lkw.beschleunige(2);
        lkw.bremse(3);
        lkw.schalte(4);
        System.out.println("Die MaxLadung ist " + ((CLkw) lkw).getM_maxLadung());

        moto.beschleunige(4);
        moto.bremse(5);
        moto.schalte(6);
        System.out.println("Die Anzahl der Raeder ist " + ((CMotorrad) moto).getM_raeder());

        System.out.println(car.toString());
        System.out.println(suv.toString());
        System.out.println(lkw.toString());
        System.out.println(moto.toString());

    }
}

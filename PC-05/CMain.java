
public class CMain {

    public static void main(String[] p_args) {

        IFahrzeug car = new CAuto();
        IFahrzeug suv = new CSuv();

        car.beschleunige(2);
        car.bremse(3);
        car.schalte(4);
        suv.beschleunige(5);
        suv.bremse(6);
        suv.schalte(7);

    }
}

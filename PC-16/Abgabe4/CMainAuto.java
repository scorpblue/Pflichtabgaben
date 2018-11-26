import java.util.ArrayList;

public class CMainAuto {

    public static void main(String[] args) {

        CAuto auto1 = new CSuv();
        CSuv suv1 = (CSuv) auto1;


        IFahrzeug auto = new CAuto();
        IFahrzeug suv = new CSuv();
        IFahrzeug motorad = new CMotorrad();
        CLkw lkw = new CLkw();

        System.out.println(auto.toString());
        auto.beschleunige(5);
        auto.schalte(2);
        auto.bremse(2);
        System.out.println(auto.toString());
        
        System.out.println(suv.toString());
        suv.beschleunige(5);
        suv.schalte(2);
        suv.bremse(1);
        System.out.println(suv.toString());

        System.out.println(motorad.toString());
        motorad.beschleunige(5);
        motorad.schalte(2);
        motorad.bremse(2);
        System.out.println(motorad.toString());

        System.out.println(lkw.toString());
        lkw.setM_anhaenger(true);
        lkw.beschleunige(3);
        lkw.schalte(2);
        lkw.bremse(1);
        System.out.println(lkw.toString());

        /*
        ArrayList<CSuv> suvs = new ArrayList<CSuv>();
        for(int i = 0; i<22; i++){
            suvs.add(new CSuv());
        }
        for (CSuv suv : suvs) {
            System.out.println(suv.toString());
        }
        */
    }

}
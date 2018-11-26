//import java.util.ArrayList;

public class CMainAuto {

    public static void main(String[] args) {

        IFahrzeug auto = new CAuto();
        IFahrzeug suv = new CSuv();

        System.out.println(suv.toString());
        suv.beschleunige(5);
        suv.schalte(2);
        suv.bremse(1);
        System.out.println(suv.toString());

        System.out.println(auto.toString());
        auto.beschleunige(5);
        auto.schalte(2);
        auto.bremse(2);
        System.out.println(auto.toString());


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